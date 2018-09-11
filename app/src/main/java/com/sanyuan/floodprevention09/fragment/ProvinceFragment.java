package com.sanyuan.floodprevention09.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.activity.CountActivity;
import com.sanyuan.floodprevention09.activity.PointProvinceActivity;
import com.sanyuan.floodprevention09.activity.TextZhankaiActivity;
import com.sanyuan.floodprevention09.base.BaseFragment;


/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/28 10:01
 */
public class ProvinceFragment extends BaseFragment implements View.OnClickListener {

    private View view;
    private FrameLayout fl1;
    private FrameLayout fl2;

    private TextView tv_zhankai;

    //    private YegeAlignTextView tv1;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;

    private RelativeLayout rl_zhankai;

    private String s = "      本周强降雨主要集中在安国市、深州市、沧州市。"
            + "\n" + "      有内涝积水报道的城市有" +
            "5" +
            "个，分别是安国市、深州市、沧州市、唐山市、秦皇岛市。"
            + "\n" + "      日降雨量超过50毫米的城市有" +
            "3" +
            "个，分别是安国市、深州市、沧州市。"
            + "\n" + "      本周的内涝特征主要表现在道路积水、路面积水流速大、下交道路被淹、车辆被淹、部分道路交通中断、建筑底层进水、小区居民被困等方面。唐山市、秦皇岛市等部分城市虽然日降雨量不大，但降雨量集中，也导致了内涝积水。";

    private StringBuffer sb;
    private SpannableStringBuilder ssb;

    private int color;

//    private String s =
//            "全国总计项目<font color='#FF9B2C'>8756</font>个" +
//                    "，累积长度<font color='#FF9B2C'>38523564</font>米" +
//                    "，总投入<font color='#FF9B2C'>8574698752</font>元" +
//                    "。目前规划项目<font color='#FF9B2C'>5024</font>个" +
//                    "，在建项目<font color='#FF9B2C'>1099</font>个" +
//                    "，已完成<font color='#FF9B2C'>20181024</font>米。";
//
//    private String s2 =
//            "根据统计信息，全国<font color='#FF9B2C'>23</font>个城市地区" +
//                    "。规划共计<font color='#FF9B2C'>2284</font>个城市地区项目" +
//                    ",<font color='#FF9B2C'>2142</font>个城市正在编制管廊专项规划" +
//                    ",<font color='#FF9B2C'>23</font>个城市的管廊专项正在报批" +
//                    "，规划累计投资<font color='#FF9B2C'>48527.38</font>元";
//
//    private String s3 =
//            "全国<font color='#FF9B2C'>23</font>个城市地区" +
//                    "。全国<font color='#FF9B2C'>284</font>个城市地区项目" +
//                    ",总计<font color='#FF9B2C'>2142</font>个" +
//                    "全国<font color='#FF9B2C'>23</font>个城市地区" +
//                    "。全国<font color='#FF9B2C'>284</font>个城市地区项目" +
//                    ",总计<font color='#FF9B2C'>2142</font>个" +
//                    "，在建项目规划总计<font color='#FF9B2C'>38562356</font>米...";

    @Override
    protected View initMyFragmentView(LayoutInflater inflater, ViewGroup container) {
        view = View.inflate(getContext(), R.layout.fragment_provice, null);

        initView();

        return view;
    }

    @Override
    protected void initData() {

    }

    private void initView() {

        color = Color.parseColor("#FF9B2C");

        sb = new StringBuffer();
        sb.append(s.toString());
        ssb = new SpannableStringBuilder(sb.toString());

        int start1 = s.indexOf("3");
        int end1 = start1 + "3".length();

        int start2 = s.indexOf("5");
        int end2 = start2 + "5".length();

        int start3 = s.indexOf("50");
        int end3 = start3 + "50".length();

        ssb.setSpan(new ForegroundColorSpan(color), start1, end1, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        ssb.setSpan(new ForegroundColorSpan(color), start2, end2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        ssb.setSpan(new ForegroundColorSpan(color), start3, end3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

        fl1 = (FrameLayout) view.findViewById(R.id.fl1);
        fl2 = (FrameLayout) view.findViewById(R.id.fl2);

        tv_zhankai = (TextView) view.findViewById(R.id.tv_zhankai);
        tv1 = (TextView) view.findViewById(R.id.tv1);
        tv2 = (TextView) view.findViewById(R.id.tv2);
        tv3 = (TextView) view.findViewById(R.id.tv3);


        fl1.setOnClickListener(this);
        fl2.setOnClickListener(this);

//        tv1.setText(Html.fromHtml(s));
//        tv2.setText(Html.fromHtml(s2));
//        tv3.setText(Html.fromHtml(s3));

        tv1.setText(ssb);

        rl_zhankai = (RelativeLayout) view.findViewById(R.id.rl_zhankai);
        rl_zhankai.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {

            case R.id.fl1:
                startActivity(new Intent(getContext(), PointProvinceActivity.class));
                break;

            case R.id.fl2:
//                startActivity(new Intent(getContext(), LibProvinceActivity.class));
                startActivity(new Intent(getContext(), CountActivity.class));
                break;

            case R.id.rl_zhankai:

                Intent intent = new Intent(getContext(), TextZhankaiActivity.class);
                intent.putExtra("flag", 2);
                startActivity(intent);

                break;

        }

    }

}
