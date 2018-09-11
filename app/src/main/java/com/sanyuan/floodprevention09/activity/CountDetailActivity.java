package com.sanyuan.floodprevention09.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.bean.CountBean;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/8/29 15:50
 */
public class CountDetailActivity extends BaseActivity implements View.OnClickListener {

    private ImageView iv_back;
    private TextView tv_title;
//    private TextView tv_shaixuan;

    private CountBean bean;

    private TextView tv0;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv0.setText(bean.getQuhua());
        tv1.setText(bean.getTime());
        tv2.setText(bean.getNum1());
        tv3.setText(bean.getNum2());

    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_count_detail;
    }

    @Override
    protected void initView() {
        iv_back = (ImageView) findViewById(R.id.iv_back);
        tv_title = (TextView) findViewById(R.id.tv_title);
//        tv_shaixuan = (TextView) findViewById(R.id.tv_shaixuan);

        iv_back.setOnClickListener(this);
//        tv_shaixuan.setOnClickListener(this);

        iv_back.setVisibility(View.VISIBLE);
//        tv_shaixuan.setVisibility(View.VISIBLE);

        tv_title.setText("降雨量详情");

        tv0 = (TextView) findViewById(R.id.tv0);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        bean = (CountBean) intent.getSerializableExtra("bean");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
//            case R.id.tv_shaixuan:
//
//                break;
        }
    }

}
