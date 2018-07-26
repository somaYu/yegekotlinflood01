package com.sanyuan.floodprevention09.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.InfoWindow;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.activity.AnalyzeDetailActivity;
import com.sanyuan.floodprevention09.adapter.CityAdapter;
import com.sanyuan.floodprevention09.base.BaseFragment;
import com.sanyuan.floodprevention09.bean.AnalyzeBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/28 10:01
 */
public class CityFragment extends BaseFragment implements BaiduMap.OnMarkerClickListener {

    BitmapDescriptor bdA = BitmapDescriptorFactory
            .fromResource(R.drawable.icon_gcoding);
    BitmapDescriptor bdB = BitmapDescriptorFactory
            .fromResource(R.drawable.icon_gcoding);
    BitmapDescriptor bdC = BitmapDescriptorFactory
            .fromResource(R.drawable.icon_gcoding);
    BitmapDescriptor bdD = BitmapDescriptorFactory
            .fromResource(R.drawable.icon_gcoding);
    BitmapDescriptor bdE = BitmapDescriptorFactory
            .fromResource(R.drawable.icon_gcoding);
    BitmapDescriptor bdF = BitmapDescriptorFactory
            .fromResource(R.drawable.icon_gcoding);
    BitmapDescriptor bdG = BitmapDescriptorFactory
            .fromResource(R.drawable.icon_gcoding);
    BitmapDescriptor bdH = BitmapDescriptorFactory
            .fromResource(R.drawable.icon_gcoding);
    BitmapDescriptor bdI = BitmapDescriptorFactory
            .fromResource(R.drawable.icon_gcoding);
    BitmapDescriptor bdJ = BitmapDescriptorFactory
            .fromResource(R.drawable.icon_gcoding);

    private Marker mMarkerA;
    private Marker mMarkerB;
    private Marker mMarkerC;
    private Marker mMarkerD;
    private Marker mMarkerE;
    private Marker mMarkerF;
    private Marker mMarkerG;
    private Marker mMarkerH;
    private Marker mMarkerI;
    private Marker mMarkerJ;

    private InfoWindow mInfoWindow;

    private MapView mv;
    private BaiduMap map;
    private MapStatusUpdate update;

    private ListView lv;

    private List<AnalyzeBean> list;
    private CityAdapter adapter;
    private LatLng llA;
    private LatLng llB;
    private LatLng llC;
    private LatLng llD;
    private LatLng llE;
    private LatLng llF;
    private LatLng llG;
    private LatLng llH;
    private LatLng llI;
    private LatLng llJ;

    private List<LatLng> list1 = new ArrayList<>();

    @Override
    protected View initMyFragmentView(LayoutInflater inflater, ViewGroup container) {
        View view = View.inflate(getContext(), R.layout.fragment_city, null);

        initView(view);

        initLLs();

        initMarkers();

        setMarkers();

        return view;
    }

    // leak?
    @Override
    public void onResume() {
        super.onResume();
        mv.onResume();
    }

    public void onPause() {
        super.onPause();
        mv.onPause();
    }

    public void onDestroyView() {
        super.onDestroyView();
        mv.onDestroy();
    }

    private void initView(View view) {

        lv = (ListView) view.findViewById(R.id.lv);

        mv = (MapView) view.findViewById(R.id.mv);
        map = mv.getMap();
        update = MapStatusUpdateFactory.zoomTo(13.0f);
        map.setMapStatus(update);

    }

    @Override
    protected void initData() {
        list = new ArrayList<>();

        AnalyzeBean bean1 = new AnalyzeBean("1", "北京市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean2 = new AnalyzeBean("2", "北京市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean3 = new AnalyzeBean("3", "北京市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean4 = new AnalyzeBean("1", "北京市", "南十地道桥雨水系统改造工程", "168.8", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean5 = new AnalyzeBean("2", "北京市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean6 = new AnalyzeBean("3", "北京市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean7 = new AnalyzeBean("1", "北京市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean8 = new AnalyzeBean("2", "北京市", "东工街雨水给排水深隧系统工程", "168.7", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean9 = new AnalyzeBean("3", "北京市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean10 = new AnalyzeBean("1", "北京市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");

        list.add(bean1);
        list.add(bean2);
        list.add(bean3);
        list.add(bean4);
        list.add(bean5);
        list.add(bean6);
        list.add(bean7);
        list.add(bean8);
        list.add(bean9);
        list.add(bean10);

    }

    @Override
    protected void initAdapter() {
        adapter = new CityAdapter(getContext(), list);

        lv.setAdapter(adapter);

        registListeners();

    }

    private void initLLs() {
        // 邯郸 114.482389,36.607858
        // 越大越向上，越大越向右
        llA = new LatLng(39.963175, 116.400244);
        llB = new LatLng(39.942821, 116.369199);
        llC = new LatLng(39.939723, 116.425541);
        llD = new LatLng(39.926965, 116.431394);

        llE = new LatLng(39.953175, 116.340244);
        llF = new LatLng(39.932821, 116.389199);
        llG = new LatLng(39.929723, 116.415541);
        llH = new LatLng(39.946965, 116.421394);

        llI = new LatLng(39.923175, 116.410244);
        llJ = new LatLng(39.952821, 116.379199);

        list1.add(llA);
        list1.add(llB);
        list1.add(llC);
        list1.add(llD);
        list1.add(llE);
        list1.add(llF);
        list1.add(llG);
        list1.add(llH);
        list1.add(llI);
        list1.add(llJ);
    }

    private void initMarkers() {
        // 掉下动画
//        ooA.animateType(MarkerOptions.MarkerAnimateType.drop);
        MarkerOptions ooA = new MarkerOptions()
                .position(llA)
                .icon(bdA)
                .scaleX(0.5f)
                .scaleY(0.5f)
                .zIndex(9)
                // 还能拖拽
//                .draggable(true)
                ;
        mMarkerA = (Marker) (map.addOverlay(ooA));

        MarkerOptions ooB = new MarkerOptions()
                .position(llB)
                .icon(bdB)
                .scaleX(0.5f)
                .scaleY(0.5f)
                .zIndex(5);
        mMarkerB = (Marker) (map.addOverlay(ooB));

        MarkerOptions ooC = new MarkerOptions()
                .position(llC)
                .icon(bdC)
//                .perspective(false)
//                .anchor(0.5f, 0.5f)
//                .rotate(30)
                .scaleX(0.5f)
                .scaleY(0.5f)
                .zIndex(7);
        mMarkerC = (Marker) (map.addOverlay(ooC));

        ArrayList<BitmapDescriptor> giflist = new ArrayList<BitmapDescriptor>();
        giflist.add(bdA);
        giflist.add(bdB);
        giflist.add(bdC);

        MarkerOptions ooD = new MarkerOptions()
                .position(llD)
                .icons(giflist)
                .zIndex(0)
                .scaleX(0.5f)
                .scaleY(0.5f)
                // 以后再加动画
//                .period(10)
                ;
        mMarkerD = (Marker) (map.addOverlay(ooD));

        // 添加
        MarkerOptions ooE = new MarkerOptions()
                .position(llE)
                .icon(bdE)
                .scaleX(0.5f)
                .scaleY(0.5f)
                .zIndex(9);
        mMarkerE = (Marker) (map.addOverlay(ooE));

        MarkerOptions ooF = new MarkerOptions()
                .position(llF)
                .icon(bdF)
                .scaleX(0.5f)
                .scaleY(0.5f)
                .zIndex(9);
        mMarkerF = (Marker) (map.addOverlay(ooF));

        MarkerOptions ooG = new MarkerOptions()
                .position(llG)
                .icon(bdG)
                .scaleX(0.5f)
                .scaleY(0.5f)
                .zIndex(9)
                // 还能拖拽
//                .draggable(true)
                ;
        mMarkerG = (Marker) (map.addOverlay(ooG));

        MarkerOptions ooH = new MarkerOptions()
                .position(llH)
                .icon(bdH)
                .scaleX(0.5f)
                .scaleY(0.5f)
                .zIndex(9)
                // 还能拖拽
//                .draggable(true)
                ;
        mMarkerH = (Marker) (map.addOverlay(ooH));

        MarkerOptions ooI = new MarkerOptions()
                .position(llI)
                .icon(bdI)
                .scaleX(0.5f)
                .scaleY(0.5f)
                .zIndex(9);
        mMarkerI = (Marker) (map.addOverlay(ooI));

        MarkerOptions ooJ = new MarkerOptions()
                .position(llJ)
                .icon(bdJ)
                .scaleX(0.5f)
                .scaleY(0.5f)
                .zIndex(9);
        mMarkerJ = (Marker) (map.addOverlay(ooJ));
    }

    private void setMarkers() {
        // 邯郸 114.482389,36.607858

        LatLng southwest = new LatLng(39.93235, 116.380338);
        LatLng northeast = new LatLng(39.957246, 116.414977);

//        LatLng southwest = new LatLng(114.43235,  36.580338);
//        LatLng northeast = new LatLng(114.457246, 36.614977);

        LatLngBounds bounds = new LatLngBounds.Builder()
                .include(northeast)
                .include(southwest)
                .build();

//        OverlayOptions ooGround = new GroundOverlayOptions()
//                .positionFromBounds(bounds)
////                .image(bdGround)
//                .transparency(0.8f);
//        map.addOverlay(ooGround);

        MapStatusUpdate update1 = MapStatusUpdateFactory
                .newLatLng(bounds.getCenter());
        map.setMapStatus(update1);

        map.setOnMarkerDragListener(new BaiduMap.OnMarkerDragListener() {
            public void onMarkerDrag(Marker marker) {
            }

            public void onMarkerDragEnd(Marker marker) {
                Toast.makeText(
                        getContext(),
                        "拖拽结束，新位置：" + marker.getPosition().latitude + ", "
                                + marker.getPosition().longitude,
                        Toast.LENGTH_LONG).show();
            }

            public void onMarkerDragStart(Marker marker) {
            }
        });
    }

    private void registListeners() {

        map.setOnMarkerClickListener(this);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                AnalyzeBean bean = list.get(i);

                Intent intent = new Intent(getContext(), AnalyzeDetailActivity.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("bean", bean);

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onMarkerClick(Marker marker) {

        String sid = marker.getId();

        Log.e("yy", "sid=" + sid);
        Log.e("yy", "marker=" + marker);

        // 最外圈
        final FrameLayout view0 = new FrameLayout(getContext());

        view0.setPadding(20, 20, 20, 20);

        // 次外圈
        final View view1 = View.inflate(getContext(), R.layout.marker_advise, null);

        TextView tv_marker1 = (TextView) view1.findViewById(R.id.tv_mark1);
        tv_marker1.setText("西四环道桥雨水系统");
        TextView tv_marker2 = (TextView) view1.findViewById(R.id.tv_mark2);
        tv_marker2.setText("169.2mm");
        TextView tv_marker3 = (TextView) view1.findViewById(R.id.tv_mark3);
        tv_marker3.setText("110.0mm");

        ImageView iv_cha = (ImageView) view1.findViewById(R.id.iv_cha);

        iv_cha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                map.hideInfoWindow();

            }
        });

        view0.addView(view1);

        LatLng ll = marker.getPosition();
        InfoWindow iw = new InfoWindow(view0, ll, -20);
        map.showInfoWindow(iw);

        return true;
    }
}
