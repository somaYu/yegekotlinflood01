package com.sanyuan.floodprevention09.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/7/26 11:24
 */
abstract class BaseActivity : AppCompatActivity() {

//    protected abstract val myViewId: Int

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(myViewId)
        setContentView(getMyViewId())

        initView()
        initData()
        initAdapter()

    }

    protected abstract fun initView()

    protected abstract fun getMyViewId(): Int

    protected abstract fun initData()

    protected open fun initAdapter() {

    }

}
