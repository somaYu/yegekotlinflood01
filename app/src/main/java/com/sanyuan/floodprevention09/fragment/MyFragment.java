package com.sanyuan.floodprevention09.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.base.BaseFragment;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/26 16:16
 */
public class MyFragment extends BaseFragment {

    private View view;

    @Override
    protected View initMyFragmentView(LayoutInflater inflater, ViewGroup container) {

        view = View.inflate(getContext(), R.layout.fragment_my, null);
        return view;
    }

    @Override
    protected void initData() {

    }

}
