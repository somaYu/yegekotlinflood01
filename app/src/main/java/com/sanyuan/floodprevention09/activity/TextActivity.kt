package com.sanyuan.floodprevention09.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import com.sanyuan.floodprevention09.R
import com.sanyuan.floodprevention09.adapter.TextAdapter
import com.sanyuan.floodprevention09.base.BaseActivity
import com.sanyuan.floodprevention09.bean.TextBean
import java.util.*

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 14:35
 */
class TextActivity : BaseActivity(), View.OnClickListener {

    private var iv_back: ImageView? = null
    private var tv_title: TextView? = null
    //    private Button bt_jump;
    private var lv: ListView? = null

    private var list: MutableList<TextBean>? = null

    private var adapter: TextAdapter? = null
    private var ll_post: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lv!!.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val bean = list!![i]

            val intent = Intent(this@TextActivity, TextDetailActivity::class.java)

            val bundle = Bundle()
            bundle.putSerializable("bean", bean)

            //                intent.putExtra("list", (Serializable) list);
            intent.putExtras(bundle)

            startActivity(intent)
        }

    }

    override fun getMyViewId(): Int {
        return R.layout.act_text
    }

    override fun initView() {
        iv_back = findViewById(R.id.iv_back) as ImageView
        tv_title = findViewById(R.id.tv_title) as TextView
        //        bt_jump = (Button) findViewById(R.id.bt_jump);
        lv = findViewById(R.id.lv) as ListView

        //        bt_jump.setOnClickListener(this);
        iv_back!!.setOnClickListener(this)

        iv_back!!.visibility = View.VISIBLE
        //        bt_jump.setVisibility(View.VISIBLE);

        tv_title!!.text = "涝情日报"

        ll_post = findViewById(R.id.ll_post) as LinearLayout
        ll_post!!.post {
            val params = ll_post!!.layoutParams

            val w1 = params.width
            val w2 = w1 + 1
            params.width = w2
            ll_post!!.layoutParams = params
        }
    }

    override fun initData() {
        list = ArrayList()

        val bean1 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")
        val bean2 = TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0")
        val bean3 = TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0")
        val bean4 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")
        val bean5 = TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0")
        val bean6 = TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0")
        val bean7 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")
        val bean8 = TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0")
        val bean9 = TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0")
        val bean10 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")

        val bean11 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")
        val bean12 = TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0")
        val bean13 = TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0")
        val bean14 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")
        val bean15 = TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0")
        val bean16 = TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0")
        val bean17 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")
        val bean18 = TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0")
        val bean19 = TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0")
        val bean20 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")

        val bean21 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")
        val bean22 = TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0")
        val bean23 = TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0")
        val bean24 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")
        val bean25 = TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0")
        val bean26 = TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0")
        val bean27 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")
        val bean28 = TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0")
        val bean29 = TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0")
        val bean30 = TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0")

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
        adapter = TextAdapter(this, list)

        lv!!.adapter = adapter
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.iv_back -> finish()
        }//            case R.id.bt_jump:
        //
        //                break;
    }
}
