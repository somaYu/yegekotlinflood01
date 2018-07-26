package com.sanyuan.floodprevention09.location;

import android.util.Log;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;
import com.sanyuan.floodprevention09.bean.MyPositionEventBean;

import org.greenrobot.eventbus.EventBus;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/7/12 14:56
 */
public class MyLocationListener extends BDAbstractLocationListener {

    @Override
    public void onReceiveLocation(BDLocation location) {

        // 经度
        double jingdu = location.getLongitude();

        // 纬度
        double weidu = location.getLatitude();

        // 定位精度，默认值为0.0f
        float radius = location.getRadius();

        // 获取经纬度坐标类型,已LocationClientOption中设置过的坐标类型为准
        String coorType = location.getCoorType();

        // 获取定位错误码
        int errorCode = location.getLocType();

        Log.e("yy", "jingdu=" + jingdu + ",weidu=" + weidu);

        String addr = location.getAddrStr();       //获取详细地址信息
        String country = location.getCountry();    //获取国家
        String province = location.getProvince();  //获取省份
        String city = location.getCity();          //获取城市
        String district = location.getDistrict();  //获取区县
        String street = location.getStreet();      //获取街道信息

        Log.e("yy", "addr=" + addr);
        Log.e("yy", "country=" + country);
        Log.e("yy", "province=" + province);
        Log.e("yy", "city=" + city);
        Log.e("yy", "district=" + district);
        Log.e("yy", "street=" + street);

        MyPositionEventBean mb = new MyPositionEventBean(
                jingdu
                , weidu
                , radius
                , coorType
                , errorCode
                , addr
                , country
                , province
                , city
                , district
                , street
        );

        EventBus.getDefault().post(mb);

    }

}
