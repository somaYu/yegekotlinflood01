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
import com.sanyuan.floodprevention09.activity.AnalyzeActivity;
import com.sanyuan.floodprevention09.activity.LibCountryActivity;
import com.sanyuan.floodprevention09.activity.PointCountryActivity;
import com.sanyuan.floodprevention09.activity.TextActivity;
import com.sanyuan.floodprevention09.activity.TextZhankaiActivity;
import com.sanyuan.floodprevention09.base.BaseFragment;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/26 16:16
 */
public class CountryFragment extends BaseFragment implements View.OnClickListener {

    private View view;
    private FrameLayout fl1;
    private FrameLayout fl2;
    private FrameLayout fl3;
    private FrameLayout fl4;

    private TextView tv_title;
    private TextView tv_zhankai;

    private TextView tv1;
    //    private YegeAlignTextView tv1;
    private TextView tv2;
    private TextView tv3;

    private RelativeLayout rl_zhankai;

    private String s = "        本周强降雨主要集中在河南省、辽宁省、安徽省、河北省、湖北省、江苏省、广西壮族自治区、山东省、江西省、湖南省、云南省、四川省、吉林省、山西省、甘肃省、天津市、内蒙古自治区、青海省等" +
            "18" +
            "省（市、自治区），较为严重的涝情发生在河南省、辽宁省、安徽省、河北省、江苏省、山东省、云南省，以北方城市为主。"
            + "\n" + "        日降雨量超过50毫米的城市有" +
            "26" +
            "个，分别是河南省漯河市、周口市，辽宁省沈阳市、营口市、辽阳市，安徽省铜陵市、安庆市、黄山市、芜湖市，河北省安国市、深州市、沧州市，湖北省随州市，江苏省南通市、苏州市、无锡市，广西壮族自治区桂林市，山东省济南市、德州市、临沂市、东营市，江西省景德镇市，湖南省娄底市，云南省丽江市，四川省雅安市，吉林省通化市。"
            + "\n" + "        日降雨量超过100毫米的城市" +
            "3" +
            "个，河南省漯河市，辽宁省沈阳市，安徽省铜陵市。"
            + "\n" + "        有内涝积水报道的城市有" +
            "33" +
            "个，分别是河南省漯河市、周口市，辽宁省沈阳市、营口市、辽阳市、大连市、铁岭市，安徽省铜陵市、芜湖市、合肥市、蚌埠市，河北省安国市、深州市、沧州市、唐山市、秦皇岛市，江苏省南通市、无锡市、南京市，广西桂林市、柳州市，山东省济南市、德州市、东营市、日照市，吉林省通化市，云南省大理市，四川省崇州市，湖北省襄阳市，山西省朔州市，甘肃省兰州市，天津市，内蒙古满洲里市。"
            + "\n" + "        本周的内涝特征主要表现在道路积水、路面积水流速大、下交道路被淹、车辆被淹、部分道路交通中断、建筑底层进水、小区居民被困等方面。兰州市、秦皇岛市、襄阳市、铁岭市等部分城市虽然日降雨量不大，但降雨量集中，也导致了内涝积水。柳州市柳江水位超警戒水位2.6米，城市排水受外洪影响较大。此外，广西融水县、广西罗成县、江苏涟水县、安徽宿松县、湖北蕲春县、广西凌云县、甘肃会宁县等" +
            "7" +
            "个县城也有内涝积水报道，最大积水深度超过60厘米。";

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

        view = View.inflate(getContext(), R.layout.fragment_country, null);

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

        int start1 = s.indexOf("18");
        int end1 = start1 + "18".length();

        int start2 = s.indexOf("26");
        int end2 = start2 + "26".length();

        int start3 = s.indexOf("3");
        int end3 = start3 + "3".length();

        int start4 = s.indexOf("33");
        int end4 = start4 + "33".length();

        int start5 = s.indexOf("7");
        int end5 = start5 + "7".length();

        ssb.setSpan(new ForegroundColorSpan(color), start1, end1, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        ssb.setSpan(new ForegroundColorSpan(color), start2, end2, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        ssb.setSpan(new ForegroundColorSpan(color), start3, end3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        ssb.setSpan(new ForegroundColorSpan(color), start4, end4, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        ssb.setSpan(new ForegroundColorSpan(color), start5, end5, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

        fl1 = (FrameLayout) view.findViewById(R.id.fl1);
        fl2 = (FrameLayout) view.findViewById(R.id.fl2);
        fl3 = (FrameLayout) view.findViewById(R.id.fl3);
        fl4 = (FrameLayout) view.findViewById(R.id.fl4);

        tv_title = (TextView) view.findViewById(R.id.tv_title);
        tv_zhankai = (TextView) view.findViewById(R.id.tv_zhankai);

//        tv1 = (YegeAlignTextView) view.findViewById(R.id.tv1);
        tv1 = (TextView) view.findViewById(R.id.tv1);
        tv2 = (TextView) view.findViewById(R.id.tv2);
        tv3 = (TextView) view.findViewById(R.id.tv3);

        fl1.setOnClickListener(this);
        fl2.setOnClickListener(this);
        fl3.setOnClickListener(this);
        fl4.setOnClickListener(this);

        tv_title.setText("全国基本信息");
//        tv1.setText(Html.fromHtml(s));
//        tv2.setText(Html.fromHtml(s2));
//        tv3.setText(Html.fromHtml(s3));

        tv1.setText(ssb);

//        tv1.post(new Runnable() {
//            @Override
//            public void run() {
//                tv1.setText(ssb);
//            }
//        });

        rl_zhankai = (RelativeLayout) view.findViewById(R.id.rl_zhankai);
        rl_zhankai.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id) {

            case R.id.fl1:

//                Intent intent1 = new Intent(getActivity(), PointCountryActivity.class);
//                intent1.putExtra("flag", 1);
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    startActivity(intent1
//                            , ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());
//                } else {
//                    startActivity(intent1);
//                }

                startActivity(new Intent(getContext(), PointCountryActivity.class));
                break;

            case R.id.fl2:
                startActivity(new Intent(getContext(), LibCountryActivity.class));
                break;

            case R.id.fl3:
                startActivity(new Intent(getContext(), AnalyzeActivity.class));
                break;

            case R.id.fl4:
                startActivity(new Intent(getContext(), TextActivity.class));

                break;

            case R.id.rl_zhankai:

                Intent intent = new Intent(getContext(), TextZhankaiActivity.class);
                intent.putExtra("flag", 1);
                startActivity(intent);

                break;

        }

    }
}
