package com.sanyuan.floodprevention09.fragment;

import android.content.Context;
import android.graphics.Color;
import android.location.LocationManager;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.adapter.LocationFPAdapter;
import com.sanyuan.floodprevention09.base.BaseFragment;
import com.sanyuan.floodprevention09.bean.MyPositionEventBean;
import com.sanyuan.floodprevention09.location.MyLocationListener;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/26 16:16
 */
public class LocationFragment extends BaseFragment {

    private View view;

    private TabLayout tl;
    private ViewPager vp;

    private List<Fragment> list = new ArrayList<>();
    private List<String> dataList = new ArrayList<>();

    private LocationFPAdapter mainAdapter;
    private TextView tv_title;
    private ImageView iv_arrow;

    // 定位相关
    public LocationClient lc = null;
    private MyLocationListener listener = new MyLocationListener();
    private LinearLayout ll_location;
    private ImageView iv_location;

    @Override
    protected View initMyFragmentView(LayoutInflater inflater, ViewGroup container) {

        view = View.inflate(getContext(), R.layout.fragment_second, null);
        initView(view);

        checkGps();

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

//        RefWatcher refWatcher = FloodApplication.getRefWatcher(getActivity());
//        refWatcher.watch(this);
    }

    private void initView(View view) {
        tl = (TabLayout) view.findViewById(R.id.tl);
        vp = (ViewPager) view.findViewById(R.id.vp);
        tv_title = (TextView) view.findViewById(R.id.tv_title);

        tv_title.setText("定位中...");
        iv_arrow = (ImageView) view.findViewById(R.id.iv_arrow);
//        iv_arrow.setVisibility(View.VISIBLE);

        ll_location = (LinearLayout) view.findViewById(R.id.ll_location);
        iv_location = (ImageView) view.findViewById(R.id.iv_location);

        ll_location.setVisibility(View.VISIBLE);
        ll_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                lc.start();
//                lc.restart();

                checkGps();

                getLocation();

                Toast.makeText(getActivity(), "正在重新定位...", Toast.LENGTH_SHORT).show();

                tv_title.setText("定位中...");

            }
        });

    }

    @Override
    protected void initData() {

        // 别忘清这个数据
        list.clear();
        list.add(new ProvinceFragment());
        list.add(new CityFragment());

        dataList.clear();
        dataList.add("全省概况");
        dataList.add("北京市概况");
    }

    @Override
    protected void initAdapter() {
        mainAdapter = new LocationFPAdapter(
//                getSupportFragmentManager()
//                getFragmentManager()
                getChildFragmentManager()
                , list
                , dataList
        );

        mainAdapter.notifyDataSetChanged();

        vp.setAdapter(mainAdapter);

        // 绑定tl和vp
        tl.setupWithViewPager(vp);

        setTabs();

    }

    private void checkGps() {
        LocationManager locManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
        if (!locManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            // 未打开位置开关，可能导致定位失败或定位不准，提示用户或做相应处理
            Toast.makeText(getActivity(), "请打开定位开关，否则定位失败", Toast.LENGTH_SHORT).show();
        }
    }

    private void getLocation() {

        lc = new LocationClient(getActivity().getApplicationContext());
        lc.registerLocationListener(listener);

        LocationClientOption lco = new LocationClientOption();

        // 高精度
        lco.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);
        // 百度经纬度坐标
        lco.setCoorType("bd09ll");
        // 请求间隔
        lco.setScanSpan(1000);
        // 是否使用gps
        lco.setOpenGps(true);
        // 是否按1s/1次输出GPS结果
        lco.setLocationNotify(true);
        // 是否stop时杀死这个进程，默认不杀死
        lco.setIgnoreKillProcess(false);
        // 是否收集crash信息
        lco.SetIgnoreCacheException(false);
        // 如果设置了该接口，首次启动定位时，会先判断当前WiFi是否超出有效期，若超出有效期，会先重新扫描WiFi，然后定位
        lco.setWifiCacheTimeOut(5 * 60 * 1000);
        // 可选，设置是否需要过滤GPS仿真结果，默认需要，即参数为false
        lco.setEnableSimulateGps(false);
        // 是否需要地址
        lco.setIsNeedAddress(true);


        lc.setLocOption(lco);

        lc.start();

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void xxxx(MyPositionEventBean mb) {

        String province = mb.getProvince();
        String city = mb.getCity();
        String district = mb.getDistrict();
        String street = mb.getStreet();

        String s = "";

        if ("北京市".equals(province)) {
            s = city + district + street;
        } else {
            s = province + city + district + street;
        }
        tv_title.setText(s);
    }

    private void setTabs() {
        for (int i = 0; i < mainAdapter.getCount(); i++) {

            //获得每一个tab
            TabLayout.Tab tab = tl.getTabAt(i);
            //给每一个tab设置view
            tab.setCustomView(R.layout.tab_item);

            TextView tv = (TextView) tab.getCustomView().findViewById(R.id.tab_text);
            tv.setText(dataList.get(i));//设置tab上的文字

            if (i == 0) {
                // 设置第一个tab的TextView是被选择的样式
                tv.setTextColor(Color.parseColor("#222222"));
                tv.setSelected(true);//第一个tab被选中
            }

        }

        tl.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                TextView tv = (TextView) tab.getCustomView().findViewById(R.id.tab_text);
                tv.setTextColor(Color.parseColor("#222222"));
                tv.setSelected(true);
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                TextView tv = (TextView) tab.getCustomView().findViewById(R.id.tab_text);
                tv.setTextColor(Color.parseColor("#aaaaaa"));
                tv.setSelected(false);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
