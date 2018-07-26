package com.sanyuan.floodprevention09.activity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.sanyuan.floodprevention09.R
import com.sanyuan.floodprevention09.base.BaseActivity
import com.sanyuan.floodprevention09.bean.TextBean

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 15:32
 */
class TextDetailActivity : BaseActivity(), View.OnClickListener {

    private var iv_back: ImageView? = null
    private var tv_title: TextView? = null
    //    private Button bt_jump;

    private var bean: TextBean? = null

    private var tv0: TextView? = null
    private var tv1: TextView? = null
    private var tv2: TextView? = null
    private var tv3: TextView? = null
    private var tv4: TextView? = null
    private var tv5: TextView? = null
    private var tv6: TextView? = null
    private var tv7: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tv0!!.text = bean!!.quhua
        tv1!!.text = bean!!.yilaodianweizhi
        tv2!!.text = bean!!.neilaoqingkuang
        tv3!!.text = bean!!.zhilijindu
        tv4!!.text = bean!!.duiyingjiangyuliang
        tv5!!.text = bean!!.shijijiangyuliang
        tv6!!.text = bean!!.jishuishendu
        tv7!!.text = bean!!.paiganshijian

    }

    override fun getMyViewId(): Int {
        return R.layout.act_text_detail
    }

    override fun initView() {
        iv_back = findViewById(R.id.iv_back) as ImageView
        tv_title = findViewById(R.id.tv_title) as TextView
        //        bt_jump = (Button) findViewById(R.id.bt_jump);

        iv_back!!.setOnClickListener(this)
        //        bt_jump.setOnClickListener(this);

        iv_back!!.visibility = View.VISIBLE
        //        bt_jump.setVisibility(View.VISIBLE);

        tv_title!!.text = "详细信息"

        tv0 = findViewById(R.id.tv0) as TextView
        tv1 = findViewById(R.id.tv1) as TextView
        tv2 = findViewById(R.id.tv2) as TextView
        tv3 = findViewById(R.id.tv3) as TextView
        tv4 = findViewById(R.id.tv4) as TextView
        tv5 = findViewById(R.id.tv5) as TextView
        tv6 = findViewById(R.id.tv6) as TextView
        tv7 = findViewById(R.id.tv7) as TextView
    }

    override fun initData() {

        val intent = intent
        bean = intent.getSerializableExtra("bean") as TextBean
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.iv_back -> finish()
        }//            case R.id.bt_jump:
        //
        //                break;
    }

}
