package com.sanyuan.floodprevention09.activity

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.transition.Slide
import android.view.View
import android.widget.ImageView
import android.widget.ListView
import android.widget.RelativeLayout
import android.widget.TextView
import com.sanyuan.floodprevention09.R
import com.sanyuan.floodprevention09.adapter.CountryAdapter
import com.sanyuan.floodprevention09.base.BaseActivity
import com.sanyuan.floodprevention09.bean.CountryBean
import java.util.*

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 8:45
 */
class PointProvinceActivity : BaseActivity(), View.OnClickListener {

    private var lv: ListView? = null
    private var iv_back: ImageView? = null
    private var tv_title: TextView? = null
    private var tv_jump: TextView? = null

    private var list: MutableList<CountryBean>? = null

    private var adapter: CountryAdapter? = null
    private var rl_jump: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        //            slide();
        //        }

    }

    override fun getMyViewId(): Int {
        return R.layout.act_province
    }

    override fun initView() {
        lv = findViewById(R.id.lv) as ListView
        iv_back = findViewById(R.id.iv_back) as ImageView
        tv_title = findViewById(R.id.tv_title) as TextView
        tv_jump = findViewById(R.id.tv_jump) as TextView
        rl_jump = findViewById(R.id.rl_jump) as RelativeLayout

        iv_back!!.visibility = View.VISIBLE
        rl_jump!!.visibility = View.VISIBLE

        iv_back!!.setOnClickListener(this)
        rl_jump!!.setOnClickListener(this)

        tv_title!!.text = "全省易涝点"
        rl_jump!!.setOnClickListener(this)
    }

    override fun initData() {
        list = ArrayList()

        val bean1 = CountryBean("1", "石家庄市", "3", "1", "4")
        val bean2 = CountryBean("2", "保定市", "5", "2", "7")
        val bean3 = CountryBean("1", "邢台市", "4", "2", "6")
        val bean4 = CountryBean("1", "石家庄市", "3", "1", "4")
        val bean5 = CountryBean("2", "保定市", "5", "2", "7")
        val bean6 = CountryBean("1", "邢台市", "4", "2", "6")
        val bean7 = CountryBean("1", "石家庄市", "3", "1", "4")
        val bean8 = CountryBean("2", "保定市", "5", "2", "7")
        val bean9 = CountryBean("1", "邢台市", "4", "2", "6")
        val bean10 = CountryBean("1", "石家庄市", "3", "1", "4")

        val bean11 = CountryBean("1", "石家庄市", "3", "1", "4")
        val bean12 = CountryBean("2", "保定市", "5", "2", "7")
        val bean13 = CountryBean("1", "邢台市", "4", "2", "6")
        val bean14 = CountryBean("1", "石家庄市", "3", "1", "4")
        val bean15 = CountryBean("2", "保定市", "5", "2", "7")
        val bean16 = CountryBean("1", "邢台市", "4", "2", "6")
        val bean17 = CountryBean("1", "石家庄市", "3", "1", "4")
        val bean18 = CountryBean("2", "保定市", "5", "2", "7")
        val bean19 = CountryBean("1", "邢台市", "4", "2", "6")
        val bean20 = CountryBean("1", "石家庄市", "3", "1", "4")

        val bean21 = CountryBean("1", "石家庄市", "3", "1", "4")
        val bean22 = CountryBean("2", "保定市", "5", "2", "7")
        val bean23 = CountryBean("1", "邢台市", "4", "2", "6")
        val bean24 = CountryBean("1", "石家庄市", "3", "1", "4")
        val bean25 = CountryBean("2", "保定市", "5", "2", "7")
        val bean26 = CountryBean("1", "邢台市", "4", "2", "6")
        val bean27 = CountryBean("1", "石家庄市", "3", "1", "4")
        val bean28 = CountryBean("2", "保定市", "5", "2", "7")
        val bean29 = CountryBean("1", "邢台市", "4", "2", "6")
        val bean30 = CountryBean("1", "石家庄市", "3", "1", "4")

        list!!.add(bean1)
        list!!.add(bean2)
        list!!.add(bean3)
        list!!.add(bean4)
        list!!.add(bean5)
        list!!.add(bean6)
        list!!.add(bean7)
        list!!.add(bean8)
        list!!.add(bean9)
        list!!.add(bean10)

        list!!.add(bean11)
        list!!.add(bean12)
        list!!.add(bean13)
        list!!.add(bean14)
        list!!.add(bean15)
        list!!.add(bean16)
        list!!.add(bean17)
        list!!.add(bean18)
        list!!.add(bean19)
        list!!.add(bean20)

        list!!.add(bean21)
        list!!.add(bean22)
        list!!.add(bean23)
        list!!.add(bean24)
        list!!.add(bean25)
        list!!.add(bean26)
        list!!.add(bean27)
        list!!.add(bean28)
        list!!.add(bean29)
        list!!.add(bean30)

    }

    override fun initAdapter() {
        adapter = CountryAdapter(this, list)

        lv!!.adapter = adapter
    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.iv_back -> finish()
            R.id.rl_jump ->

                // 跳图表

                //                Intent intent = new Intent(PointProvinceActivity.this, PillarProvinceActivity.class);
                //                intent.putExtra("flag", 4);
                //                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                //                    startActivity(intent
                //                            , ActivityOptions.makeSceneTransitionAnimation(this
                ////                                    , bt7
                //                                    , tv_jump
                //                                    , "share")
                //                                    .toBundle());
                //                }else {
                //                    startActivity(intent);
                //                }

                startActivity(Intent(this@PointProvinceActivity, PillarProvinceActivity::class.java))
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private fun slide() {

        val ts = Slide()
        ts.duration = 2000

        window.enterTransition = ts
        window.exitTransition = ts
    }

}
