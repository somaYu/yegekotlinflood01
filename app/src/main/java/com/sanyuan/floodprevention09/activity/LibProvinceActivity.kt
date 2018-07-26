package com.sanyuan.floodprevention09.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import com.sanyuan.floodprevention09.R
import com.sanyuan.floodprevention09.adapter.LibAdapter
import com.sanyuan.floodprevention09.base.BaseActivity
import com.sanyuan.floodprevention09.bean.LibBean
import java.util.*

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/28 10:50
 */
class LibProvinceActivity : BaseActivity(), View.OnClickListener {

    private var iv_back: ImageView? = null
    private var tv_title: TextView? = null
    private var tv_jump: TextView? = null
    private var lv: ListView? = null

    private var list: MutableList<LibBean>? = null

    private var adapter: LibAdapter? = null
    private var ll_post: LinearLayout? = null
    private var rl_jump: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun getMyViewId(): Int {
        return R.layout.act_libprovince
    }

    override fun initView() {
        iv_back = findViewById(R.id.iv_back) as ImageView
        tv_title = findViewById(R.id.tv_title) as TextView
        tv_jump = findViewById(R.id.tv_jump) as TextView
        lv = findViewById(R.id.lv) as ListView
        ll_post = findViewById(R.id.ll_post) as LinearLayout
        rl_jump = findViewById(R.id.rl_jump) as RelativeLayout

        iv_back!!.visibility = View.VISIBLE
        rl_jump!!.visibility = View.VISIBLE

        tv_title!!.text = "全省项目库信息"

        rl_jump!!.setOnClickListener(this)
        iv_back!!.setOnClickListener(this)
        rl_jump!!.setOnClickListener(this)

        // 上下对不齐这点小问题还能难倒我？
        ll_post!!.post {
            val params = ll_post!!.layoutParams

            val w1 = params.width
            val w2 = w1 + 4
            params.width = w2
            ll_post!!.layoutParams = params
        }

    }

    override fun initData() {

        list = ArrayList()

        val bean1 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean2 = LibBean("2", "邢台市", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99")
        val bean3 = LibBean("3", "邯郸市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean4 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean5 = LibBean("2", "邢台市", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99")
        val bean6 = LibBean("3", "邯郸市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean7 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean8 = LibBean("2", "邢台市", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99")
        val bean9 = LibBean("3", "邯郸市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean10 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")

        val bean11 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean12 = LibBean("2", "邢台市", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99")
        val bean13 = LibBean("3", "邯郸市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean14 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean15 = LibBean("2", "邢台市", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99")
        val bean16 = LibBean("3", "邯郸市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean17 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean18 = LibBean("2", "邢台市", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99")
        val bean19 = LibBean("3", "邯郸市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean20 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")

        val bean21 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean22 = LibBean("2", "邢台市", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99")
        val bean23 = LibBean("3", "邯郸市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean24 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean25 = LibBean("2", "邢台市", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99")
        val bean26 = LibBean("3", "邯郸市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean27 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean28 = LibBean("2", "邢台市", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99")
        val bean29 = LibBean("3", "邯郸市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")
        val bean30 = LibBean("1", "石家庄市", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2")


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
        super.initAdapter()

        adapter = LibAdapter(this, list)
        lv!!.adapter = adapter
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.iv_back -> finish()
            R.id.rl_jump ->
                // 跳图表
                startActivity(Intent(this@LibProvinceActivity, PieProvinceActivity::class.java))
        }
    }

}
