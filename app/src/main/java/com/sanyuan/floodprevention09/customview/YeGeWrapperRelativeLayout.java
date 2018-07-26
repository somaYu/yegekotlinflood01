package com.sanyuan.floodprevention09.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/29 16:22
 */

public class YeGeWrapperRelativeLayout extends RelativeLayout {

    Context mContext;

    Paint mPaint = new Paint();

    private int x0;
    private int y0;

    private int x1;
    private int y1;

    private int x2;
    private int y2;

    public YeGeWrapperRelativeLayout(Context context) {
        this(context, null);
    }

    public YeGeWrapperRelativeLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public YeGeWrapperRelativeLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        initView(context, attrs, defStyle);
    }

    private void initView(Context context, AttributeSet attrs, int defStyleAttr) {

        mContext = context;
        mPaint.setColor(Color.RED);
        mPaint.setAntiAlias(true);
        mPaint.setTextAlign(Paint.Align.CENTER);
        mPaint.setStrokeWidth(3.0f);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    // 呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵呵
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        int action = event.getAction();

        switch (action) {

            case MotionEvent.ACTION_DOWN:

                x1 = (int) event.getX();
                y1 = (int) event.getY();

                break;
            case MotionEvent.ACTION_MOVE:

                x2 = (int) event.getX();
                y2 = (int) event.getY();

                x0 = x2 - x1;
                y0 = y2 - y1;

                boolean a1 = (x0 < 0);

                boolean a2 = (x0 > 0);

                if (a1 || a2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }

                break;
            case MotionEvent.ACTION_UP:

                break;
            case MotionEvent.ACTION_CANCEL:

                break;

        }

        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

}
