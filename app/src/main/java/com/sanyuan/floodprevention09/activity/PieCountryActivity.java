package com.sanyuan.floodprevention09.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.customview.PieViewCountry;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/28 9:02
 */
public class PieCountryActivity extends BaseActivity implements View.OnClickListener{

    private ImageView iv_back;
    private TextView tv_title;
    private PieViewCountry bcv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_piecountry;
    }

    @Override
    protected void initView() {
        iv_back = (ImageView) findViewById(R.id.iv_back);
        tv_title = (TextView) findViewById(R.id.tv_title);
        bcv = (PieViewCountry) findViewById(R.id.bcv);

        iv_back.setOnClickListener(this);
        iv_back.setVisibility(View.VISIBLE);

        tv_title.setText("全国项目库");
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {

            case R.id.iv_back:
                finish();
                break;

        }

    }
}
