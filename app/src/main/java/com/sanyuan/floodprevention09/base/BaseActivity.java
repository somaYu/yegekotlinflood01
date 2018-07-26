package com.sanyuan.floodprevention09.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/7/26 11:24
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getMyViewId());

        initView();
        initData();
        initAdapter();

    }

    protected abstract int getMyViewId();

    protected abstract void initView();

    protected abstract void initData();

    protected void initAdapter() {

    }

}
