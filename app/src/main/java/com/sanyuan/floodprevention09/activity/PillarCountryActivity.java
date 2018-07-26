package com.sanyuan.floodprevention09.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.customview.PillarViewCountry;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 17:41
 */
public class PillarCountryActivity extends BaseActivity implements View.OnClickListener {

    private PillarViewCountry bcv;
    private ImageView iv_back;
    private TextView tv_title;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_pillarcountry;
    }

    @Override
    protected void initView() {
        bcv = (PillarViewCountry) findViewById(R.id.bcv);
        iv_back = (ImageView) findViewById(R.id.iv_back);
        iv_back.setOnClickListener(this);
        tv_title = (TextView) findViewById(R.id.tv_title);

        iv_back.setVisibility(View.VISIBLE);

        tv_title.setText("全国易涝点");
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
