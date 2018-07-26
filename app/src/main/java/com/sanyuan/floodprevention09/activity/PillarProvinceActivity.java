package com.sanyuan.floodprevention09.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.transition.ChangeBounds;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.customview.PillarViewProvince;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 17:41
 */
public class PillarProvinceActivity extends BaseActivity implements View.OnClickListener {

    private PillarViewProvince bcv;
    private ImageView iv_back;
    private TextView tv_title;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            share();
//        }
    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_pillarprovince;
    }

    @Override
    protected void initView() {
        bcv = (PillarViewProvince) findViewById(R.id.bcv);

//        tv_title = (TextView) findViewById(R.id.tv_title);
//        tv_title.setText("全省易涝点");

        iv_back = (ImageView) findViewById(R.id.iv_back);
        iv_back.setOnClickListener(this);
        iv_back.setVisibility(View.VISIBLE);

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {

            case R.id.iv_back:
                finish();
                break;

        }

    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void share() {

        ChangeBounds cb = new ChangeBounds();
        cb.addTarget("share");
        cb.setDuration(2000);

//        Toast.makeText(getApplicationContext(), "共", Toast.LENGTH_SHORT).show();

        getWindow().setSharedElementEnterTransition(cb);
        getWindow().setSharedElementExitTransition(cb);


    }

}
