package com.sanyuan.floodprevention09.application;

import android.app.Application;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/28 14:05
 */
public class FloodApplication extends Application {

//    private RefWatcher refWatcher;

//    public static RefWatcher getRefWatcher(Context context) {
//        FloodApplication application = (FloodApplication) context.getApplicationContext();
//        return application.refWatcher;
//    }
    
    @Override
    public void onCreate() {
        super.onCreate();

        // 1.百度地图

        // 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
        SDKInitializer.initialize(this);
        //自4.3.0起，百度地图SDK所有接口均支持百度坐标和国测局坐标，用此方法设置您使用的坐标类型.
        //包括BD09LL和GCJ02两种坐标，默认是BD09LL坐标。
        SDKInitializer.setCoordType(CoordType.BD09LL);

        // 2.LeakCanary

//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            // This process is dedicated to LeakCanary for heap analysis.
//            // You should not init your app in this process.
//            return;
//        }
//
//        refWatcher = LeakCanary.install(this);

    }

}
