package com.sanyuan.floodprevention09.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.adapter.LibAdapter;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.bean.LibBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 9:50
 */
public class LibCountryActivity extends BaseActivity implements View.OnClickListener {

    private ImageView iv_back;
    private TextView tv_title;
    private TextView tv_jump;
    private ListView lv;

    private List<LibBean> list;

    private LibAdapter adapter;
    private LinearLayout ll_post;
    private RelativeLayout rl_jump;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_libcountry;
    }

    @Override
    protected void initView() {
        iv_back = (ImageView) findViewById(R.id.iv_back);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_jump = (TextView) findViewById(R.id.tv_jump);
        lv = (ListView) findViewById(R.id.lv);
        ll_post = (LinearLayout) findViewById(R.id.ll_post);
        rl_jump = (RelativeLayout) findViewById(R.id.rl_jump);

        iv_back.setVisibility(View.VISIBLE);
        rl_jump.setVisibility(View.VISIBLE);

        tv_title.setText("全国项目库信息");

        rl_jump.setOnClickListener(this);
        iv_back.setOnClickListener(this);
        rl_jump.setOnClickListener(this);

        ll_post.post(new Runnable() {
            @Override
            public void run() {

                ViewGroup.LayoutParams params = ll_post.getLayoutParams();

                int w1 = params.width;
                int w2 = w1 + 4;
                params.width = w2;
                ll_post.setLayoutParams(params);

            }
        });

    }

    @Override
    protected void initData() {

        list = new ArrayList<>();

        LibBean bean1 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean2 = new LibBean("2", "辽宁省", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99");
        LibBean bean3 = new LibBean("3", "吉林省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean4 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean5 = new LibBean("2", "辽宁省", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99");
        LibBean bean6 = new LibBean("3", "吉林省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean7 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean8 = new LibBean("2", "辽宁省", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99");
        LibBean bean9 = new LibBean("3", "吉林省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean10 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");

        LibBean bean11 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean12 = new LibBean("2", "辽宁省", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99");
        LibBean bean13 = new LibBean("3", "吉林省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean14 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean15 = new LibBean("2", "辽宁省", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99");
        LibBean bean16 = new LibBean("3", "吉林省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean17 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean18 = new LibBean("2", "辽宁省", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99");
        LibBean bean19 = new LibBean("3", "吉林省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean20 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");

        LibBean bean21 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean22 = new LibBean("2", "辽宁省", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99");
        LibBean bean23 = new LibBean("3", "吉林省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean24 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean25 = new LibBean("2", "辽宁省", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99");
        LibBean bean26 = new LibBean("3", "吉林省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean27 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean28 = new LibBean("2", "辽宁省", "10737.67", "18636.14", "28720.78", "36808.41", "94902.99");
        LibBean bean29 = new LibBean("3", "吉林省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");
        LibBean bean30 = new LibBean("1", "河北省", "52312.7", "92993.49", "142769.2", "186323.8", "474399.2");

        list.add(bean1);
        list.add(bean2);
        list.add(bean3);
        list.add(bean4);
        list.add(bean5);
        list.add(bean6);
        list.add(bean7);
        list.add(bean8);
        list.add(bean9);
        list.add(bean10);

        list.add(bean11);
        list.add(bean12);
        list.add(bean13);
        list.add(bean14);
        list.add(bean15);
        list.add(bean16);
        list.add(bean17);
        list.add(bean18);
        list.add(bean19);
        list.add(bean20);

        list.add(bean21);
        list.add(bean22);
        list.add(bean23);
        list.add(bean24);
        list.add(bean25);
        list.add(bean26);
        list.add(bean27);
        list.add(bean28);
        list.add(bean29);
        list.add(bean30);

    }

    @Override
    protected void initAdapter() {
        super.initAdapter();

        adapter = new LibAdapter(this, list);
        lv.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.rl_jump:
                // 跳图表
                startActivity(new Intent(LibCountryActivity.this, PieCountryActivity.class));
                break;
        }
    }
}
