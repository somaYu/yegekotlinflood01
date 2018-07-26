package com.sanyuan.floodprevention09.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.sanyuan.floodprevention09.R
import com.sanyuan.floodprevention09.adapter.AnalyzeAdapter
import com.sanyuan.floodprevention09.base.BaseActivity
import com.sanyuan.floodprevention09.bean.AnalyzeBean
import java.util.*

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 11:07
 */
class AnalyzeActivity : BaseActivity(), View.OnClickListener {

    private var iv_back: ImageView? = null
    private var tv_title: TextView? = null
    //    private Button bt_jump;
    private var lv: ListView? = null

    private var list: MutableList<AnalyzeBean>? = null

    private var adapter: AnalyzeAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lv!!.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val bean = list!![i]

            val intent = Intent(this@AnalyzeActivity, AnalyzeDetailActivity::class.java)

            val bundle = Bundle()
            bundle.putSerializable("bean", bean)

            //                intent.putExtra("list", (Serializable) list);
            intent.putExtras(bundle)

            startActivity(intent)
        }

    }

    override fun getMyViewId(): Int {
        return R.layout.act_analyze
    }

    override fun initView() {
        iv_back = findViewById(R.id.iv_back) as ImageView
        tv_title = findViewById(R.id.tv_title) as TextView
        //        bt_jump = (Button) findViewById(R.id.bt_jump);
        lv = findViewById(R.id.lv) as ListView

        iv_back!!.setOnClickListener(this)
        //        bt_jump.setOnClickListener(this);

        iv_back!!.visibility = View.VISIBLE
        //        bt_jump.setVisibility(View.VISIBLE);

        tv_title!!.text = "涝情分析"
    }

    override fun initData() {
        list = ArrayList()

        val bean1 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")
        val bean2 = AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中")
        val bean3 = AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成")
        val bean4 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "168.8", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")
        val bean5 = AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中")
        val bean6 = AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成")
        val bean7 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")
        val bean8 = AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "168.7", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中")
        val bean9 = AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成")
        val bean10 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")

        val bean11 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")
        val bean12 = AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "168.8", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中")
        val bean13 = AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成")
        val bean14 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")
        val bean15 = AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中")
        val bean16 = AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成")
        val bean17 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")
        val bean18 = AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "168.7", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中")
        val bean19 = AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成")
        val bean20 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")

        val bean21 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")
        val bean22 = AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中")
        val bean23 = AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成")
        val bean24 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")
        val bean25 = AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "168.8", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中")
        val bean26 = AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成")
        val bean27 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")
        val bean28 = AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中")
        val bean29 = AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成")
        val bean30 = AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成")

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
        adapter = AnalyzeAdapter(this, list)

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
