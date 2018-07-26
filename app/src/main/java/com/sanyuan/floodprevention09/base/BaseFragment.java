package com.sanyuan.floodprevention09.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/7/26 14:08
 */
public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return initMyFragmentView(inflater, container);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        initAdapter();

    }

    protected abstract View initMyFragmentView(LayoutInflater inflater, ViewGroup container);

    protected abstract void initData();

    protected void initAdapter() {
    }

}
