package com.sanyuan.floodprevention09.activity

import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.sanyuan.floodprevention09.R
import com.sanyuan.floodprevention09.base.BaseActivity

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/7/13 16:38
 */
class TextZhankaiActivity : BaseActivity() {

    private val s1 = "全国总计项目<font color='#FF9B2C'>8756</font>个" +
            "，累积长度<font color='#FF9B2C'>38523564</font>米" +
            "，总投入<font color='#FF9B2C'>8574698752</font>元" +
            "。目前规划项目<font color='#FF9B2C'>5024</font>个" +
            "，在建项目<font color='#FF9B2C'>1099</font>个" +
            "，已完成<font color='#FF9B2C'>20181024</font>米。"

    private val s2 = "根据统计信息，全国<font color='#FF9B2C'>23</font>个城市地区" +
            "。规划共计<font color='#FF9B2C'>2284</font>个城市地区项目" +
            ",<font color='#FF9B2C'>2142</font>个城市正在编制管廊专项规划" +
            ",<font color='#FF9B2C'>23</font>个城市的管廊专项正在报批" +
            "，规划累计投资<font color='#FF9B2C'>48527.38</font>元"

    private val s3 = "全国<font color='#FF9B2C'>23</font>个城市地区" +
            "。全国<font color='#FF9B2C'>284</font>个城市地区项目" +
            ",总计<font color='#FF9B2C'>2142</font>个" +
            "全国<font color='#FF9B2C'>23</font>个城市地区" +
            "。全国<font color='#FF9B2C'>284</font>个城市地区项目" +
            ",总计<font color='#FF9B2C'>2142</font>个" +
            "，在建项目规划总计<font color='#FF9B2C'>38562356</font>米," +
            "全国<font color='#FF9B2C'>23</font>个城市地区" +
            "。全国<font color='#FF9B2C'>284</font>个城市地区项目" +
            ",总计<font color='#FF9B2C'>2142</font>个" +
            "全国<font color='#FF9B2C'>23</font>个城市地区" +
            "。全国<font color='#FF9B2C'>284</font>个城市地区项目" +
            ",总计<font color='#FF9B2C'>2142</font>个" +
            "，在建项目规划总计<font color='#FF9B2C'>38562356</font>米,"

    private var tv1: TextView? = null
    private var tv2: TextView? = null
    private var tv3: TextView? = null
    private var iv_back: ImageView? = null
    private var tv_title: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getMyViewId(): Int {
        return R.layout.act_zhakai
    }

    override fun initView() {
        tv1 = findViewById(R.id.tv1) as TextView
        tv2 = findViewById(R.id.tv2) as TextView
        tv3 = findViewById(R.id.tv3) as TextView

        tv_title = findViewById(R.id.tv_title) as TextView
        iv_back = findViewById(R.id.iv_back) as ImageView

        tv1!!.text = Html.fromHtml(s1)
        tv2!!.text = Html.fromHtml(s2)
        tv3!!.text = Html.fromHtml(s3)
        tv_title!!.visibility = View.INVISIBLE

        iv_back!!.visibility = View.VISIBLE

        iv_back!!.setOnClickListener { finish() }
    }

    override fun initData() {

    }

}
