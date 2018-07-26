package com.sanyuan.floodprevention09.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.transition.Explode;
import android.transition.Transition;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.adapter.CountryAdapter;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.bean.CountryBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 8:45
 */
public class PointCountryActivity extends BaseActivity implements View.OnClickListener {

    private ListView lv;
    private ImageView iv_back;
    private TextView tv_title;
    private TextView tv_jump;

    private List<CountryBean> list;

    private CountryAdapter adapter;
    private RelativeLayout rl_jump;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

//                Intent intent = new Intent(PointCountryActivity.this, PointProvinceActivity.class);
//                intent.putExtra("flag", 2);
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    startActivity(intent
//                            , ActivityOptions.makeSceneTransitionAnimation(PointCountryActivity.this).toBundle());
//                }else {
//                    startActivity(intent);
//                }

                startActivity(new Intent(PointCountryActivity.this, PointProvinceActivity.class));

            }
        });

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            explore();
//        }

    }

    @Override
    protected int getMyViewId() {
        return R.layout.act_country;
    }

    @Override
    protected void initView() {
        lv = (ListView) findViewById(R.id.lv);
        iv_back = (ImageView) findViewById(R.id.iv_back);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_jump = (TextView) findViewById(R.id.tv_jump);
        rl_jump = (RelativeLayout) findViewById(R.id.rl_jump);

        iv_back.setVisibility(View.VISIBLE);
        rl_jump.setVisibility(View.VISIBLE);

        iv_back.setOnClickListener(this);
        tv_jump.setOnClickListener(this);

        tv_title.setText("全国易涝点");
        rl_jump.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        list = new ArrayList<>();

        CountryBean bean1 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean2 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean3 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean4 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean5 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean6 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean7 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean8 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean9 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean10 = new CountryBean("2", "山东省", "15", "3", "18");

        CountryBean bean11 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean12 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean13 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean14 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean15 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean16 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean17 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean18 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean19 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean20 = new CountryBean("2", "山东省", "15", "3", "18");

        CountryBean bean21 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean22 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean23 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean24 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean25 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean26 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean27 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean28 = new CountryBean("2", "山东省", "15", "3", "18");
        CountryBean bean29 = new CountryBean("1", "河北省", "12", "5", "17");
        CountryBean bean30 = new CountryBean("2", "山东省", "15", "3", "18");

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
        adapter = new CountryAdapter(this, list);

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
                startActivity(new Intent(PointCountryActivity.this, PillarCountryActivity.class));
                break;
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void explore() {
        Transition ts = new Explode();
        ts.setDuration(2000);

        getWindow().setEnterTransition(ts);
        getWindow().setExitTransition(ts);
    }

}
