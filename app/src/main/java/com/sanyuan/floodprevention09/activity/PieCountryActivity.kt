package com.sanyuan.floodprevention09.activity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.sanyuan.floodprevention09.R
import com.sanyuan.floodprevention09.base.BaseActivity
import com.sanyuan.floodprevention09.customview.PieViewCountry

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/28 9:02
 */
class PieCountryActivity : BaseActivity(), View.OnClickListener {

    private var iv_back: ImageView? = null
    private var tv_title: TextView? = null
    private var bcv: PieViewCountry? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getMyViewId(): Int {
        return R.layout.act_piecountry
    }

    override fun initView() {
        iv_back = findViewById(R.id.iv_back) as ImageView
        tv_title = findViewById(R.id.tv_title) as TextView
        bcv = findViewById(R.id.bcv) as PieViewCountry

        iv_back!!.setOnClickListener(this)
        iv_back!!.visibility = View.VISIBLE

        tv_title!!.text = "全国项目库"
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
