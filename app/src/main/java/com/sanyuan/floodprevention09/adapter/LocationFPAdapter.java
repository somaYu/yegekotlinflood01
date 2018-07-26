package com.sanyuan.floodprevention09.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


public class LocationFPAdapter extends FragmentPagerAdapter {

    private List<Fragment> list;

    private List<String> dataList;

    public LocationFPAdapter(FragmentManager fm) {
        super(fm);
    }

    public LocationFPAdapter(
            FragmentManager fm
            , List<Fragment> list
            , List<String> dataList
    ) {
        super(fm);
        this.list = list;

        this.dataList = dataList;
    }


    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return dataList.get(position);
    }

}
