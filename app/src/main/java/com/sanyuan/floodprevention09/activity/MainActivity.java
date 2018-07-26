package com.sanyuan.floodprevention09.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.fragment.CountryFragment;
import com.sanyuan.floodprevention09.fragment.LocationFragment;
import com.sanyuan.floodprevention09.fragment.MyFragment;

import java.util.ArrayList;
import java.util.List;

import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnNeverAskAgain;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;

@RuntimePermissions
public class MainActivity extends BaseActivity implements View.OnClickListener {

    private FrameLayout fl_main;
    private LinearLayout ll_main_bottom;

    private View view_select;

    private List<Fragment> fragmentList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        onClick(view_select);

        checkMyPermission();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        fragmentList.clear();
    }

    @Override
    protected int getMyViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        fl_main = (FrameLayout) findViewById(R.id.fl_main);
        ll_main_bottom = (LinearLayout) findViewById(R.id.ll_main_bottom);

        view_select = ll_main_bottom.getChildAt(0);
    }

    @Override
    protected void initData() {

        initFragment();
        initBottomClick();

    }

    // Leak?
    private void initFragment() {

        fragmentList = new ArrayList<>();

        fragmentList.add(new CountryFragment());
        fragmentList.add(new LocationFragment());
        fragmentList.add(new MyFragment());

    }

    private void initBottomClick() {
        int childCount = ll_main_bottom.getChildCount();
        for (int i = 0; i < childCount; i++) {
            //view-->viewGroup--->FrameLayout
            View view = ll_main_bottom.getChildAt(i);
            view.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        int indexOfChild = ll_main_bottom.indexOfChild(v);
        changeMyUI(indexOfChild);
        changeMyFragment(indexOfChild);
    }

    private void changeMyUI(int indexOfChild) {
        for (int i = 0; i < ll_main_bottom.getChildCount(); i++) {
            View view = ll_main_bottom.getChildAt(i);
            if (i == indexOfChild) {
                setEnable(view, false);
            } else {
                setEnable(view, true);
            }
        }
    }

    private void changeMyFragment(int indexOfChild) {
//        getFragmentManager().beginTransaction().replace(R.id.fl_main,
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main,
                fragmentList.get(indexOfChild)).commit();
    }

    private void setEnable(View view, boolean b) {
        if (view instanceof ViewGroup) {
            int childCount = ((ViewGroup) view).getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ((ViewGroup) view).getChildAt(i);
                childAt.setEnabled(b);
            }
        }
    }

    private void checkMyPermission() {
        MainActivityPermissionsDispatcher.callWithCheck(this);
    }

    // 在需要获取权限的地方
    @SuppressLint("MissingPermission")
    @NeedsPermission(
            {
                    Manifest.permission.READ_PHONE_STATE
                    , Manifest.permission.ACCESS_COARSE_LOCATION
                    , Manifest.permission.ACCESS_FINE_LOCATION
                    , Manifest.permission.READ_EXTERNAL_STORAGE
                    , Manifest.permission.WRITE_EXTERNAL_STORAGE
            }
    )
    void call() {
        Log.e("yy", "请求5个权限");
    }

    // 提示用户为何要开启此权限
    @OnShowRationale(
            {
                    Manifest.permission.READ_PHONE_STATE
                    , Manifest.permission.ACCESS_COARSE_LOCATION
                    , Manifest.permission.ACCESS_FINE_LOCATION
                    , Manifest.permission.READ_EXTERNAL_STORAGE
                    , Manifest.permission.WRITE_EXTERNAL_STORAGE
            }
    )
    void showWhy(final PermissionRequest request) {
        new AlertDialog.Builder(this)
                .setMessage("需要您开启权限，否则定位等功能将无法正常工作")
                .setPositiveButton("知道了", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        request.proceed();//再次执行权限请求
                    }
                })
                .show();
    }

    // 用户选择拒绝时的提示
    @OnPermissionDenied(
            {
                    Manifest.permission.READ_PHONE_STATE
                    , Manifest.permission.ACCESS_COARSE_LOCATION
                    , Manifest.permission.ACCESS_FINE_LOCATION
                    , Manifest.permission.READ_EXTERNAL_STORAGE
                    , Manifest.permission.WRITE_EXTERNAL_STORAGE
            }
    )
    void showDenied() {
        Toast.makeText(this, "如不开启权限，定位等功能将无法正常工作！", Toast.LENGTH_SHORT).show();
    }


    // 用户选择不再询问后的提示
    @OnNeverAskAgain(
            {
                    Manifest.permission.READ_PHONE_STATE
                    , Manifest.permission.ACCESS_COARSE_LOCATION
                    , Manifest.permission.ACCESS_FINE_LOCATION
                    , Manifest.permission.READ_EXTERNAL_STORAGE
                    , Manifest.permission.WRITE_EXTERNAL_STORAGE
            }
    )
    void showNeverAsk() {
        new AlertDialog.Builder(this)
                .setMessage("该功能需要权限，不开启将无法正常工作！")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        MainActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);

    }
}
