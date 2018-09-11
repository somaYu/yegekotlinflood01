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
import com.sanyuan.floodprevention09.adapter.CountAdapter;
import com.sanyuan.floodprevention09.adapter.ListDropDownAdapter;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.bean.CountBean;
import com.yyydjk.library.DropDownMenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/8/29 15:18
 */

public class CountActivity extends BaseActivity implements View.OnClickListener {

    private ImageView iv_back;
    private TextView tv_title;

//    private TextView tv_shaixuan;

    private ListView lv;

    private DropDownMenu ddm;

    private List<CountBean> list;

    private List<View> dropList = new ArrayList<>();

    private CountAdapter adapter;

    private ListDropDownAdapter dropAdapter1;
    private ListDropDownAdapter dropAdapter2;
    private ListDropDownAdapter dropAdapter3;
    private ListDropDownAdapter dropAdapter4;

    private String ss0[] = {
            "行政区划"
            , "时间"
            , "24小时降雨量"
            , "最大24小时降雨量"
    };

    private String ss1[] = {"全部", "辽宁省沈阳市", "辽宁省沈阳市", "吉林省长春市"};
    private String ss2[] = {"全部", "2018-08-27", "2018-08-28", "2018-08-27"};
    private String ss3[] = {"全部", "56.78", "34.21", "34.21"};
    private String ss4[] = {"全部", "111.8", "222.8", "333.8"};

    private int position = 0;
    private LinearLayout ll_count;

    private int flag = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                CountBean bean = list.get(i);

                Intent intent = new Intent(CountActivity.this, CountDetailActivity.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("bean", bean);

//                intent.putExtra("list", (Serializable) list);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (ddm.isShowing()) {
            ddm.closeMenu();
        }
    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_count;
    }

    @Override
    protected void initView() {

        iv_back = (ImageView) findViewById(R.id.iv_back);
        tv_title = (TextView) findViewById(R.id.tv_title);

//        tv_shaixuan = (TextView) findViewById(R.id.tv_shaixuan);

//        lv = (ListView) findViewById(R.id.lv);

        iv_back.setOnClickListener(this);
//        tv_shaixuan.setOnClickListener(this);

        iv_back.setVisibility(View.VISIBLE);
//        tv_shaixuan.setVisibility(View.VISIBLE);

        tv_title.setText("降雨量信息");

        ll_count = (LinearLayout) findViewById(R.id.ll_count);
        ddm = (DropDownMenu) findViewById(R.id.ddm);

        setDdm();

    }

    private void setDdm() {

        final ListView lv1 = new ListView(this);
        lv1.setDividerHeight(0);
        dropAdapter1 = new ListDropDownAdapter(this, Arrays.asList(ss1));
        lv1.setAdapter(dropAdapter1);

        final ListView lv2 = new ListView(this);
        lv2.setDividerHeight(0);
        dropAdapter2 = new ListDropDownAdapter(this, Arrays.asList(ss2));
        lv2.setAdapter(dropAdapter2);

        final ListView lv3 = new ListView(this);
        lv3.setDividerHeight(0);
        dropAdapter3 = new ListDropDownAdapter(this, Arrays.asList(ss3));
        lv3.setAdapter(dropAdapter3);

        final ListView lv4 = new ListView(this);
        lv4.setDividerHeight(0);
        dropAdapter4 = new ListDropDownAdapter(this, Arrays.asList(ss4));
        lv4.setAdapter(dropAdapter4);

        dropList.add(lv1);
        dropList.add(lv2);
        dropList.add(lv3);
        dropList.add(lv4);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dropAdapter1.setCheckItem(position);
                ddm.setTabText(position == 0 ? ss0[0] : ss1[position]);
                ddm.closeMenu();

                flag = 1;

                list.clear();

                CountBean bean1 = new CountBean("0", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
                CountBean bean2 = new CountBean("0", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
                CountBean bean3 = new CountBean("0", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
                CountBean bean4 = new CountBean("0", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
                CountBean bean5 = new CountBean("0", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
                CountBean bean6 = new CountBean("0", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
                CountBean bean7 = new CountBean("0", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
                CountBean bean8 = new CountBean("0", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
                CountBean bean9 = new CountBean("0", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");

                list.add(bean1);
                list.add(bean2);
                list.add(bean3);
                list.add(bean4);
                list.add(bean5);
                list.add(bean6);
                list.add(bean7);
                list.add(bean8);
                list.add(bean9);

                adapter.notifyDataSetChanged();

            }
        });

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dropAdapter2.setCheckItem(position);
                ddm.setTabText(position == 0 ? ss0[1] : ss2[position]);
                ddm.closeMenu();

                flag = 2;

                list.clear();

                CountBean bean1 = new CountBean("0", "河北省石家庄市", "2018-08-27", "56.78", "111.8");
                CountBean bean2 = new CountBean("0", "河北省石家庄市", "2018-08-27", "56.78", "111.8");
                CountBean bean3 = new CountBean("0", "河北省石家庄市", "2018-08-27", "56.78", "111.8");
                CountBean bean4 = new CountBean("0", "河北省石家庄市", "2018-08-27", "56.78", "111.8");
                CountBean bean5 = new CountBean("0", "河北省石家庄市", "2018-08-27", "56.78", "111.8");
                CountBean bean6 = new CountBean("0", "河北省石家庄市", "2018-08-27", "56.78", "111.8");
                CountBean bean7 = new CountBean("0", "河北省石家庄市", "2018-08-27", "56.78", "111.8");
                CountBean bean8 = new CountBean("0", "河北省石家庄市", "2018-08-27", "56.78", "111.8");
                CountBean bean9 = new CountBean("0", "河北省石家庄市", "2018-08-27", "56.78", "111.8");

                list.add(bean1);
                list.add(bean2);
                list.add(bean3);
                list.add(bean4);
                list.add(bean5);
                list.add(bean6);
                list.add(bean7);
                list.add(bean8);
                list.add(bean9);

                adapter.notifyDataSetChanged();
            }
        });

        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dropAdapter3.setCheckItem(position);
                ddm.setTabText(position == 0 ? ss0[2] : ss3[position]);
                ddm.closeMenu();

                flag = 3;

                list.clear();

                CountBean bean1 = new CountBean("0", "河北省保定市", "2018-08-27", "56.78", "111.8");
                CountBean bean2 = new CountBean("0", "河北省保定市", "2018-08-27", "56.78", "111.8");
                CountBean bean3 = new CountBean("0", "河北省保定市", "2018-08-27", "56.78", "111.8");
                CountBean bean4 = new CountBean("0", "河北省保定市", "2018-08-27", "56.78", "111.8");
                CountBean bean5 = new CountBean("0", "河北省保定市", "2018-08-27", "56.78", "111.8");
                CountBean bean6 = new CountBean("0", "河北省保定市", "2018-08-27", "56.78", "111.8");
                CountBean bean7 = new CountBean("0", "河北省保定市", "2018-08-27", "56.78", "111.8");
                CountBean bean8 = new CountBean("0", "河北省保定市", "2018-08-27", "56.78", "111.8");
                CountBean bean9 = new CountBean("0", "河北省保定市", "2018-08-27", "56.78", "111.8");

                list.add(bean1);
                list.add(bean2);
                list.add(bean3);
                list.add(bean4);
                list.add(bean5);
                list.add(bean6);
                list.add(bean7);
                list.add(bean8);
                list.add(bean9);

                adapter.notifyDataSetChanged();

            }
        });

        lv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dropAdapter4.setCheckItem(position);
                ddm.setTabText(position == 0 ? ss0[3] : ss4[position]);
                ddm.closeMenu();

                flag = 4;

                list.clear();

                CountBean bean1 = new CountBean("0", "吉林省长春市", "2018-08-27", "56.78", "111.8");
                CountBean bean2 = new CountBean("0", "吉林省长春市", "2018-08-27", "56.78", "111.8");
                CountBean bean3 = new CountBean("0", "吉林省长春市", "2018-08-27", "56.78", "111.8");
                CountBean bean4 = new CountBean("0", "吉林省长春市", "2018-08-27", "56.78", "111.8");
                CountBean bean5 = new CountBean("0", "吉林省长春市", "2018-08-27", "56.78", "111.8");
                CountBean bean6 = new CountBean("0", "吉林省长春市", "2018-08-27", "56.78", "111.8");
                CountBean bean7 = new CountBean("0", "吉林省长春市", "2018-08-27", "56.78", "111.8");
                CountBean bean8 = new CountBean("0", "吉林省长春市", "2018-08-27", "56.78", "111.8");
                CountBean bean9 = new CountBean("0", "吉林省长春市", "2018-08-27", "56.78", "111.8");

                list.add(bean1);
                list.add(bean2);
                list.add(bean3);
                list.add(bean4);
                list.add(bean5);
                list.add(bean6);
                list.add(bean7);
                list.add(bean8);
                list.add(bean9);

                adapter.notifyDataSetChanged();

            }
        });

//        View item_floodcount_title = View.inflate(this, R.layout.item_floodcount_title, null);
//        ddm.addView(item_floodcount_title);

        lv = new ListView(this);
        lv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        lv.setAdapter(adapter);

//        ddm.setDropDownMenu(Arrays.asList(ss0), dropList, ll_count);
        ddm.setDropDownMenu(Arrays.asList(ss0), dropList, lv);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                CountBean bean = list.get(i);

                Intent intent = new Intent(CountActivity.this, CountDetailActivity.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable("bean", bean);

//                intent.putExtra("list", (Serializable) list);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }

    @Override
    protected void initData() {
        list = new ArrayList<>();

        CountBean bean1 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
        CountBean bean2 = new CountBean("2", "辽宁省沈阳市", "2018-08-28", "34.21", "111.8");
        CountBean bean3 = new CountBean("3", "吉林省长春市", "2018-08-27", "34.21", "111.8");
        CountBean bean4 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
        CountBean bean5 = new CountBean("2", "辽宁省沈阳市", "2018-08-28", "34.21", "111.8");
        CountBean bean6 = new CountBean("3", "吉林省长春市", "2018-08-27", "34.21", "111.8");
        CountBean bean7 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");
        CountBean bean8 = new CountBean("2", "辽宁省沈阳市", "2018-08-28", "34.21", "111.8");
        CountBean bean9 = new CountBean("3", "吉林省长春市", "2018-08-27", "34.21", "111.8");
        CountBean bean10 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "111.8");

        CountBean bean11 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "222.8");
        CountBean bean12 = new CountBean("2", "辽宁省沈阳市", "2018-08-28", "34.21", "222.8");
        CountBean bean13 = new CountBean("3", "吉林省长春市", "2018-08-27", "34.21", "222.8");
        CountBean bean14 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "222.8");
        CountBean bean15 = new CountBean("2", "辽宁省沈阳市", "2018-08-28", "34.21", "222.8");
        CountBean bean16 = new CountBean("3", "吉林省长春市", "2018-08-27", "34.21", "222.8");
        CountBean bean17 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "222.8");
        CountBean bean18 = new CountBean("2", "辽宁省沈阳市", "2018-08-28", "34.21", "222.8");
        CountBean bean19 = new CountBean("3", "吉林省长春市", "2018-08-27", "34.21", "222.8");
        CountBean bean20 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "222.8");

        CountBean bean21 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "333.8");
        CountBean bean22 = new CountBean("2", "辽宁省沈阳市", "2018-08-28", "34.21", "333.8");
        CountBean bean23 = new CountBean("3", "吉林省长春市", "2018-08-27", "34.21", "333.8");
        CountBean bean24 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "333.8");
        CountBean bean25 = new CountBean("2", "辽宁省沈阳市", "2018-08-28", "34.21", "333.8");
        CountBean bean26 = new CountBean("3", "吉林省长春市", "2018-08-27", "34.21", "333.8");
        CountBean bean27 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "333.8");
        CountBean bean28 = new CountBean("2", "辽宁省沈阳市", "2018-08-28", "34.21", "333.8");
        CountBean bean29 = new CountBean("3", "吉林省长春市", "2018-08-27", "34.21", "333.8");
        CountBean bean30 = new CountBean("1", "辽宁省沈阳市", "2018-08-27", "56.78", "333.8");

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
        adapter = new CountAdapter(this, list);

        lv.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_shaixuan:

                break;
        }
    }

}
