package com.sanyuan.floodprevention09.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.adapter.TextAdapter;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.bean.TextBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 14:35
 */
public class TextActivity extends BaseActivity implements View.OnClickListener {

    private ImageView iv_back;
    private TextView tv_title;
//    private Button bt_jump;
    private ListView lv;

    private List<TextBean> list;

    private TextAdapter adapter;
    private LinearLayout ll_post;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextBean bean = list.get(i);

                Intent intent = new Intent(TextActivity.this, TextDetailActivity.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("bean", bean);

//                intent.putExtra("list", (Serializable) list);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_text;
    }

    @Override
    protected void initView() {
        iv_back = (ImageView) findViewById(R.id.iv_back);
        tv_title = (TextView) findViewById(R.id.tv_title);
//        bt_jump = (Button) findViewById(R.id.bt_jump);
        lv = (ListView) findViewById(R.id.lv);

//        bt_jump.setOnClickListener(this);
        iv_back.setOnClickListener(this);

        iv_back.setVisibility(View.VISIBLE);
//        bt_jump.setVisibility(View.VISIBLE);

        tv_title.setText("涝情日报");

        ll_post = (LinearLayout) findViewById(R.id.ll_post);
        ll_post.post(new Runnable() {
            @Override
            public void run() {

                ViewGroup.LayoutParams params = ll_post.getLayoutParams();

                int w1 = params.width;
                int w2 = w1 + 1;
                params.width = w2;
                ll_post.setLayoutParams(params);

            }
        });
    }

    @Override
    protected void initData() {
        list = new ArrayList<>();

        TextBean bean1 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");
        TextBean bean2 = new TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0");
        TextBean bean3 = new TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0");
        TextBean bean4 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");
        TextBean bean5 = new TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0");
        TextBean bean6 = new TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0");
        TextBean bean7 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");
        TextBean bean8 = new TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0");
        TextBean bean9 = new TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0");
        TextBean bean10 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");

        TextBean bean11 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");
        TextBean bean12 = new TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0");
        TextBean bean13 = new TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0");
        TextBean bean14 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");
        TextBean bean15 = new TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0");
        TextBean bean16 = new TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0");
        TextBean bean17 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");
        TextBean bean18 = new TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0");
        TextBean bean19 = new TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0");
        TextBean bean20 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");

        TextBean bean21 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");
        TextBean bean22 = new TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0");
        TextBean bean23 = new TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0");
        TextBean bean24 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");
        TextBean bean25 = new TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0");
        TextBean bean26 = new TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0");
        TextBean bean27 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");
        TextBean bean28 = new TextBean("2", "河北省邢台市", "200.0", "150.0", "轻度内涝3处", "东工街雨水给排水深隧系统工程", "未治理", "90.0", "60.0");
        TextBean bean29 = new TextBean("3", "辽宁省沈阳市", "150.0", "60.0", "轻度内涝1处", "凌空二街雨水深隧系统工程", "治理中", "50.0", "80.0");
        TextBean bean30 = new TextBean("1", "辽宁省沈阳市", "120.0", "150.0", "严重内涝4处,轻度内涝5处", "南十地道桥雨水系统改造工程", "已治理", "80.0", "70.0");

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
        adapter = new TextAdapter(this, list);

        lv.setAdapter(adapter);
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
