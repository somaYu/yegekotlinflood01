/**
 * Copyright 2014  XCL-Charts
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @Project XCL-Charts
 * @Description Android图表基类库
 * @author XiongChuanLiang<br                                                                                                                               />(xcl_168@aliyun.com)
 * @Copyright Copyright (c) 2014 XCL-Charts (www.xclcharts.com)
 * @license http://www.apache.org/licenses/  Apache v2 License
 * @version 1.0
 */
package com.sanyuan.floodprevention09.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

import org.xclcharts.chart.BarChart;
import org.xclcharts.chart.BarData;
import org.xclcharts.common.DensityUtil;
import org.xclcharts.common.IFormatterDoubleCallBack;
import org.xclcharts.common.IFormatterTextCallBack;
import org.xclcharts.event.click.BarPosition;
import org.xclcharts.renderer.XEnum;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

/**
 * @author XiongChuanLiang<br                                                                                                                               />(xcl_168@aliyun.com)
 * @ClassName BarChart02View
 * @Description 柱形图例子(横向)
 */

// BarChart02View

public class PillarViewCountry extends DemoView {

    private static final String TAG = "BarChart02View";
    private BarChart chart = new BarChart();

    //标签轴
    private List<String> stringList = new LinkedList<String>();
    private List<BarData> dataList = new LinkedList<BarData>();


    public PillarViewCountry(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        initView();
    }

    public PillarViewCountry(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public PillarViewCountry(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initView();
    }

    private void initView() {
        chartLabels();
        chartDataSet();
        chartRender();

        //綁定手势滑动事件
//        this.bindTouch(this, chart);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        //图所占范围大小
        if (null != chart) chart.setChartRange(w, h);
    }

//    @Override
//    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        int expandSpec = MeasureSpec.makeMeasureSpec(
//                Integer.MAX_VALUE >> 2,
//                MeasureSpec.AT_MOST);
//        super.onMeasure(widthMeasureSpec, expandSpec);
//    }

//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//
//        int expandSpec = MeasureSpec.makeMeasureSpec(
//                Integer.MAX_VALUE >> 2,
//                MeasureSpec.AT_MOST);
//
//        int w = MeasureSpec.getSize(widthMeasureSpec);
//        int h0 = MeasureSpec.getSize(expandSpec);
//
////        setMeasuredDimension(1080, 5000);
////        super.onMeasure(widthMeasureSpec, expandSpec);
//        setMeasuredDimension(w, h0);
//
//    }


    private void chartRender() {

        try {
            //设置绘图区默认缩进px值,留置空间显示Axis,Axistitle....
            int[] ltrb = getBarLnDefaultSpadding();
            chart.setPadding(DensityUtil.dip2px(getContext(), 50), ltrb[1], ltrb[2], ltrb[3]);


//            chart.setTitle("全国易涝点");
            chart.setTitle("");
//			chart.addSubtitle("(XCL-Charts Demo)");
            chart.addSubtitle("");
            chart.setTitleVerticalAlign(XEnum.VerticalAlign.MIDDLE);
            chart.setTitleAlign(XEnum.HorizontalAlign.LEFT);

            //数据源
            chart.setDataSource(dataList);
            chart.setCategories(stringList);

            //轴标题
//			chart.getAxisTitle().setLeftTitle("所售商品");
//			chart.getAxisTitle().setLowerTitle("纯利润(天)");
//			chart.getAxisTitle().setRightTitle("生意兴隆通四海,财源茂盛达三江。");

            chart.getAxisTitle().setLeftTitle("");
            chart.getAxisTitle().setLowerTitle("数量");
            chart.getAxisTitle().setRightTitle("");

            //数据轴
//			chart.getDataAxis().setAxisMax(500);
//			chart.getDataAxis().setAxisMin(100);
//			chart.getDataAxis().setAxisSteps(100);
            chart.getDataAxis().setAxisMax(20);
            chart.getDataAxis().setAxisMin(0);
            chart.getDataAxis().setAxisSteps(4);

            chart.getDataAxis().getTickLabelPaint().
                    setColor(Color.rgb(199, 88, 122));


            chart.getDataAxis().setLabelFormatter(new IFormatterTextCallBack() {

                @Override
                public String textFormatter(String value) {
                    // TODO Auto-generated method stub
//                    String tmp = value + "万元";
                    String tmp = value;
                    return tmp;
                }

            });

            //网格
            chart.getPlotGrid().showHorizontalLines();
            chart.getPlotGrid().showVerticalLines();
            chart.getPlotGrid().showEvenRowBgColor();

            //标签轴文字旋转-45度
            chart.getCategoryAxis().setTickLabelRotateAngle(-45f);
            //横向显示柱形
            chart.setChartDirection(XEnum.Direction.HORIZONTAL);
            //在柱形顶部显示值
            chart.getBar().setItemLabelVisible(true);
            chart.getBar().getItemLabelPaint().setTextSize(22);

            chart.setItemLabelFormatter(new IFormatterDoubleCallBack() {
                @Override
                public String doubleFormatter(Double value) {
                    // TODO Auto-generated method stub
                    DecimalFormat df = new DecimalFormat("[#0]");
                    String label = df.format(value).toString();
                    return label;
                }
            });

            //激活点击监听
            chart.ActiveListenItemClick();
            chart.showClikedFocus();
			
			
			/*
			chart.setDataAxisPosition(XEnum.DataAxisPosition.BOTTOM);
			chart.getDataAxis().setVerticalTickPosition(XEnum.VerticalAlign.BOTTOM);
			
			chart.setCategoryAxisPosition(XEnum.CategoryAxisPosition.LEFT);
			chart.getCategoryAxis().setHorizontalTickAlign(Align.LEFT);
			*/

        } catch (Exception e) {
            // TODO Auto-generated catch block
            Log.e(TAG, e.toString());
        }


    }

    private void chartDataSet() {
        //标签对应的柱形数据集
        List<Double> dataSeriesA = new LinkedList<Double>();

        dataSeriesA.add((double) 8);
        dataSeriesA.add((double) 16);
        dataSeriesA.add((double) 5);
        dataSeriesA.add((double) 11);
        dataSeriesA.add((double) 7);

        dataSeriesA.add((double) 18);
        dataSeriesA.add((double) 16);
        dataSeriesA.add((double) 5);
        dataSeriesA.add((double) 11);
        dataSeriesA.add((double) 17);

        dataSeriesA.add((double) 18);
        dataSeriesA.add((double) 6);
        dataSeriesA.add((double) 15);
        dataSeriesA.add((double) 1);
        dataSeriesA.add((double) 17);

        dataSeriesA.add((double) 18);
        dataSeriesA.add((double) 6);
        dataSeriesA.add((double) 15);
        dataSeriesA.add((double) 1);
        dataSeriesA.add((double) 7);

//        BarData BarDataA = new BarData("已治理", dataSeriesA, Color.rgb(0, 0, 255));
        BarData BarDataA = new BarData("已治理", dataSeriesA, Color.rgb(30, 220, 170));


        List<Double> dataSeriesB = new LinkedList<Double>();

        dataSeriesB.add((double) 12);
        dataSeriesB.add((double) 8);
        dataSeriesB.add((double) 6);
        dataSeriesB.add((double) 9);
        dataSeriesB.add((double) 10);

        dataSeriesB.add((double) 12);
        dataSeriesB.add((double) 8);
        dataSeriesB.add((double) 6);
        dataSeriesB.add((double) 9);
        dataSeriesB.add((double) 10);

        dataSeriesB.add((double) 12);
        dataSeriesB.add((double) 8);
        dataSeriesB.add((double) 6);
        dataSeriesB.add((double) 9);
        dataSeriesB.add((double) 10);

        dataSeriesB.add((double) 12);
        dataSeriesB.add((double) 8);
        dataSeriesB.add((double) 6);
        dataSeriesB.add((double) 9);
        dataSeriesB.add((double) 10);

//        BarData BarDataB = new BarData("未治理", dataSeriesB, Color.rgb(255, 0, 0));
        BarData BarDataB = new BarData("已治理", dataSeriesB, Color.rgb(100, 160, 240));

        dataList.add(BarDataA);
        dataList.add(BarDataB);
    }

    private void chartLabels() {

        stringList.add("北京市");
        stringList.add("黑龙江省");
        stringList.add("河北省");
        stringList.add("山东省");
        stringList.add("内蒙古省");

        stringList.add("北京市");
        stringList.add("黑龙江省");
        stringList.add("河北省");
        stringList.add("山东省");
        stringList.add("内蒙古省");

        stringList.add("北京市");
        stringList.add("黑龙江省");
        stringList.add("河北省");
        stringList.add("山东省");
        stringList.add("内蒙古省");

        stringList.add("北京市");
        stringList.add("黑龙江省");
        stringList.add("河北省");
        stringList.add("山东省");
        stringList.add("内蒙古省");

    }


    @Override
    public void render(Canvas canvas) {
        try {
            chart.render(canvas);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub
        super.onTouchEvent(event);
        if (event.getAction() == MotionEvent.ACTION_UP) {
            triggerClick(event.getX(), event.getY());
        }
        return true;
    }


    //触发监听
    private void triggerClick(float x, float y) {
        BarPosition record = chart.getPositionRecord(x, y);
        if (null == record) return;

        BarData bData = dataList.get(record.getDataID());
        Double bValue = bData.getDataSet().get(record.getDataChildID());

//        Toast.makeText(this.getContext(),
//                "info:" + record.getRectInfo() +
//                        " Key:" + bData.getKey() +
//                        " Current Value:" + Double.toString(bValue),
//                Toast.LENGTH_SHORT).show();

        chart.showFocusRectF(record.getRectF());
        chart.getFocusPaint().setStyle(Style.STROKE);
        chart.getFocusPaint().setStrokeWidth(3);
        chart.getFocusPaint().setColor(Color.GREEN);
        this.invalidate();
    }

}
