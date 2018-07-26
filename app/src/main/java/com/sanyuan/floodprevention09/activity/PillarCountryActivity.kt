package com.sanyuan.floodprevention09.activity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.sanyuan.floodprevention09.R
import com.sanyuan.floodprevention09.base.BaseActivity
import com.sanyuan.floodprevention09.customview.PillarViewCountry

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 17:41
 */
class PillarCountryActivity : BaseActivity(), View.OnClickListener {

    private var bcv: PillarViewCountry? = null
    private var iv_back: ImageView? = null
    private var tv_title: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getMyViewId(): Int {
        return R.layout.act_pillarcountry
    }

    override fun initView() {
        bcv = findViewById(R.id.bcv) as PillarViewCountry
        iv_back = findViewById(R.id.iv_back) as ImageView
        iv_back!!.setOnClickListener(this)
        tv_title = findViewById(R.id.tv_title) as TextView

        iv_back!!.visibility = View.VISIBLE

        tv_title!!.text = "全国易涝点"
    }

    override fun initData() {

    }

    override fun onClick(view: View) {
        val id = view.id

        when (id) {

            R.id.iv_back -> finish()
        }

    }
}
