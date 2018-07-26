package com.sanyuan.floodprevention09.activity

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.transition.ChangeBounds
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.sanyuan.floodprevention09.R
import com.sanyuan.floodprevention09.base.BaseActivity
import com.sanyuan.floodprevention09.customview.PillarViewProvince

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 17:41
 */
class PillarProvinceActivity : BaseActivity(), View.OnClickListener {

    private var bcv: PillarViewProvince? = null
    private var iv_back: ImageView? = null
    private val tv_title: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        //            share();
        //        }
    }

    override fun getMyViewId(): Int {
        return R.layout.act_pillarprovince
    }

    override fun initView() {
        bcv = findViewById(R.id.bcv) as PillarViewProvince

        //        tv_title = (TextView) findViewById(R.id.tv_title);
        //        tv_title.setText("全省易涝点");

        iv_back = findViewById(R.id.iv_back) as ImageView
        iv_back!!.setOnClickListener(this)
        iv_back!!.visibility = View.VISIBLE

    }

    override fun initData() {

    }

    override fun onClick(view: View) {
        val id = view.id

        when (id) {

            R.id.iv_back -> finish()
        }

    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private fun share() {

        val cb = ChangeBounds()
        cb.addTarget("share")
        cb.duration = 2000

        //        Toast.makeText(getApplicationContext(), "共", Toast.LENGTH_SHORT).show();

        window.sharedElementEnterTransition = cb
        window.sharedElementExitTransition = cb


    }

}
