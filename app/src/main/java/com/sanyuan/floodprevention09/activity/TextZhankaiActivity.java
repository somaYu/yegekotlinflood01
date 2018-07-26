package com.sanyuan.floodprevention09.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.base.BaseActivity;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/7/13 16:38
 */
public class TextZhankaiActivity extends BaseActivity {

    private String s1 =
            "全国总计项目<font color='#FF9B2C'>8756</font>个" +
                    "，累积长度<font color='#FF9B2C'>38523564</font>米" +
                    "，总投入<font color='#FF9B2C'>8574698752</font>元" +
                    "。目前规划项目<font color='#FF9B2C'>5024</font>个" +
                    "，在建项目<font color='#FF9B2C'>1099</font>个" +
                    "，已完成<font color='#FF9B2C'>20181024</font>米。";

    private String s2 =
            "根据统计信息，全国<font color='#FF9B2C'>23</font>个城市地区" +
                    "。规划共计<font color='#FF9B2C'>2284</font>个城市地区项目" +
                    ",<font color='#FF9B2C'>2142</font>个城市正在编制管廊专项规划" +
                    ",<font color='#FF9B2C'>23</font>个城市的管廊专项正在报批" +
                    "，规划累计投资<font color='#FF9B2C'>48527.38</font>元";

    private String s3 =
            "全国<font color='#FF9B2C'>23</font>个城市地区" +
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
                    "，在建项目规划总计<font color='#FF9B2C'>38562356</font>米,";

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private ImageView iv_back;
    private TextView tv_title;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_zhakai;
    }

    @Override
    protected void initView() {
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);

        tv_title = (TextView) findViewById(R.id.tv_title);
        iv_back = (ImageView) findViewById(R.id.iv_back);

        tv1.setText(Html.fromHtml(s1));
        tv2.setText(Html.fromHtml(s2));
        tv3.setText(Html.fromHtml(s3));
        tv_title.setVisibility(View.INVISIBLE);

        iv_back.setVisibility(View.VISIBLE);

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void initData() {

    }

}
