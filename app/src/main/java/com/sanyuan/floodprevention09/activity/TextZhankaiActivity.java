package com.sanyuan.floodprevention09.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.base.BaseActivity;
import com.sanyuan.floodprevention09.customview.YegeAlignTextView;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/7/13 16:38
 */
public class TextZhankaiActivity extends BaseActivity {

    private String s1a = "        本周强降雨主要集中在河南省、辽宁省、安徽省、河北省、湖北省、江苏省、广西壮族自治区、山东省、江西省、湖南省、云南省、四川省、吉林省、山西省、甘肃省、天津市、内蒙古自治区、青海省等18省（市、自治区），较为严重的涝情发生在河南省、辽宁省、安徽省、河北省、江苏省、山东省、云南省，以北方城市为主。"
            + "\n" + "        日降雨量超过50毫米的城市有26个，分别是河南省漯河市、周口市，辽宁省沈阳市、营口市、辽阳市，安徽省铜陵市、安庆市、黄山市、芜湖市，河北省安国市、深州市、沧州市，湖北省随州市，江苏省南通市、苏州市、无锡市，广西壮族自治区桂林市，山东省济南市、德州市、临沂市、东营市，江西省景德镇市，湖南省娄底市，云南省丽江市，四川省雅安市，吉林省通化市。"
            + "\n" + "        日降雨量超过100毫米的城市3个，河南省漯河市，辽宁省沈阳市，安徽省铜陵市。"
            + "\n" + "        有内涝积水报道的城市有33个，分别是河南省漯河市、周口市，辽宁省沈阳市、营口市、辽阳市、大连市、铁岭市，安徽省铜陵市、芜湖市、合肥市、蚌埠市，河北省安国市、深州市、沧州市、唐山市、秦皇岛市，江苏省南通市、无锡市、南京市，广西桂林市、柳州市，山东省济南市、德州市、东营市、日照市，吉林省通化市，云南省大理市，四川省崇州市，湖北省襄阳市，山西省朔州市，甘肃省兰州市，天津市，内蒙古满洲里市。"
            + "\n" + "        本周的内涝特征主要表现在道路积水、路面积水流速大、下交道路被淹、车辆被淹、部分道路交通中断、建筑底层进水、小区居民被困等方面。兰州市、秦皇岛市、襄阳市、铁岭市等部分城市虽然日降雨量不大，但降雨量集中，也导致了内涝积水。柳州市柳江水位超警戒水位2.6米，城市排水受外洪影响较大。此外，广西融水县、广西罗成县、江苏涟水县、安徽宿松县、湖北蕲春县、广西凌云县、甘肃会宁县等7个县城也有内涝积水报道，最大积水深度超过60厘米。";

    private String s1b = "      本周强降雨主要集中在安国市、深州市、沧州市。"
            + "\n" + "      日降雨量超过50毫米的城市有3个，分别是安国市、深州市、沧州市。"
            + "\n" + "      有内涝积水报道的城市有5个，分别是安国市、深州市、沧州市、唐山市、秦皇岛市。"
            + "\n" + "      本周的内涝特征主要表现在道路积水、路面积水流速大、下交道路被淹、车辆被淹、部分道路交通中断、建筑底层进水、小区居民被困等方面。唐山市、秦皇岛市等部分城市虽然日降雨量不大，但降雨量集中，也导致了内涝积水。";

//    private String s1 =
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
//                    "，在建项目规划总计<font color='#FF9B2C'>38562356</font>米," +
//                    "全国<font color='#FF9B2C'>23</font>个城市地区" +
//                    "。全国<font color='#FF9B2C'>284</font>个城市地区项目" +
//                    ",总计<font color='#FF9B2C'>2142</font>个" +
//                    "全国<font color='#FF9B2C'>23</font>个城市地区" +
//                    "。全国<font color='#FF9B2C'>284</font>个城市地区项目" +
//                    ",总计<font color='#FF9B2C'>2142</font>个" +
//                    "，在建项目规划总计<font color='#FF9B2C'>38562356</font>米,";

    private YegeAlignTextView tv1;
    private TextView tv2;
    private TextView tv3;
    private ImageView iv_back;
    private TextView tv_title;
    private Intent intent;
    private int flag;

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

        intent = getIntent();
        flag = intent.getIntExtra("flag", 1);

        tv1 = (YegeAlignTextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);

        tv_title = (TextView) findViewById(R.id.tv_title);
        iv_back = (ImageView) findViewById(R.id.iv_back);

//        tv1.setText(Html.fromHtml(s1));
//        tv2.setText(Html.fromHtml(s2));
//        tv3.setText(Html.fromHtml(s3));

        if (flag == 1) {
            tv1.setText(s1a);
        } else if (flag == 2) {
            tv1.setText(s1b);
        }

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
