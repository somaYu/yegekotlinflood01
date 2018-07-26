package com.sanyuan.floodprevention09.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.bean.TextBean;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 15:32
 */
public class TextDetailActivity extends BaseActivity implements View.OnClickListener {


    private ImageView iv_back;
    private TextView tv_title;
//    private Button bt_jump;

    private TextBean bean;

    private TextView tv0;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv0.setText(bean.getQuhua());
        tv1.setText(bean.getYilaodianweizhi());
        tv2.setText(bean.getNeilaoqingkuang());
        tv3.setText(bean.getZhilijindu());
        tv4.setText(bean.getDuiyingjiangyuliang());
        tv5.setText(bean.getShijijiangyuliang());
        tv6.setText(bean.getJishuishendu());
        tv7.setText(bean.getPaiganshijian());

    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_text_detail;
    }

    @Override
    protected void initView() {
        iv_back = (ImageView) findViewById(R.id.iv_back);
        tv_title = (TextView) findViewById(R.id.tv_title);
//        bt_jump = (Button) findViewById(R.id.bt_jump);

        iv_back.setOnClickListener(this);
//        bt_jump.setOnClickListener(this);

        iv_back.setVisibility(View.VISIBLE);
//        bt_jump.setVisibility(View.VISIBLE);

        tv_title.setText("详细信息");

        tv0 = (TextView) findViewById(R.id.tv0);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
    }

    @Override
    protected void initData() {

        Intent intent = getIntent();
        bean = (TextBean) intent.getSerializableExtra("bean");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;
//            case R.id.bt_jump:
//
//                break;
        }
    }

}
