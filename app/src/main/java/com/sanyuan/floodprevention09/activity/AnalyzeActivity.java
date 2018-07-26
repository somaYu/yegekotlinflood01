package com.sanyuan.floodprevention09.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.adapter.AnalyzeAdapter;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.bean.AnalyzeBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 11:07
 */
public class AnalyzeActivity extends BaseActivity implements View.OnClickListener {

    private ImageView iv_back;
    private TextView tv_title;
//    private Button bt_jump;
    private ListView lv;

    private List<AnalyzeBean> list;

    private AnalyzeAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                AnalyzeBean bean = list.get(i);

                Intent intent = new Intent(AnalyzeActivity.this, AnalyzeDetailActivity.class);

                Bundle bundle=new Bundle();
                bundle.putSerializable("bean", bean);

//                intent.putExtra("list", (Serializable) list);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_analyze;
    }

    @Override
    protected void initView() {
        iv_back = (ImageView) findViewById(R.id.iv_back);
        tv_title = (TextView) findViewById(R.id.tv_title);
//        bt_jump = (Button) findViewById(R.id.bt_jump);
        lv = (ListView) findViewById(R.id.lv);

        iv_back.setOnClickListener(this);
//        bt_jump.setOnClickListener(this);

        iv_back.setVisibility(View.VISIBLE);
//        bt_jump.setVisibility(View.VISIBLE);

        tv_title.setText("涝情分析");
    }

    @Override
    protected void initData() {
        list = new ArrayList<>();

        AnalyzeBean bean1 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean2 = new AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean3 = new AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean4 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "168.8", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean5 = new AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean6 = new AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean7 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean8 = new AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "168.7", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean9 = new AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean10 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");

        AnalyzeBean bean11 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean12 = new AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "168.8", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean13 = new AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean14 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean15 = new AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean16 = new AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean17 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean18 = new AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "168.7", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean19 = new AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean20 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");

        AnalyzeBean bean21 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean22 = new AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean23 = new AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean24 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean25 = new AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "168.8", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean26 = new AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean27 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");
        AnalyzeBean bean28 = new AnalyzeBean("2", "辽宁省沈阳市", "东工街雨水给排水深隧系统工程", "189.6", "107.9", "75.2", "60.3", "110.5", "50.0", "治理中");
        AnalyzeBean bean29 = new AnalyzeBean("3", "辽宁省沈阳市", "凌空二街雨水深隧系统工程", "189.6", "172.2", "55.2", "80.3", "120.5", "40.0", "未完成");
        AnalyzeBean bean30 = new AnalyzeBean("1", "辽宁省沈阳市", "南十地道桥雨水系统改造工程", "189.6", "222.8", "95.2", "80.3", "100.5", "70.0", "已完成");

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
        adapter = new AnalyzeAdapter(this, list);

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
