package com.sanyuan.floodprevention09.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sanyuan.floodprevention09.R;
import com.sanyuan.floodprevention09.bean.AnalyzeBean;

import java.util.List;

/**
 * @author wodemingziyouyidianchang
 * @version 1.0.0
 * @since 2018/6/27 9:18
 */
public class CityAdapter extends BaseAdapter {

    private Context mContext;

    private List<AnalyzeBean> list;

    public CityAdapter(Context mContext, List<AnalyzeBean> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        AnalyzeBean bean = list.get(i);

        String num1 = bean.getNum1();

        ViewHolder holder = null;

        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_analyze, null);
//            holder = new ViewHolder();
            holder = new ViewHolder(convertView);

            holder.rootView = (LinearLayout) convertView.findViewById(R.id.ll);
            holder.tv1 = (TextView) convertView.findViewById(R.id.tv1);
            holder.tv2 = (TextView) convertView.findViewById(R.id.tv2);
            holder.tv3 = (TextView) convertView.findViewById(R.id.tv3);
            holder.tv4 = (TextView) convertView.findViewById(R.id.tv4);
            holder.tv5 = (TextView) convertView.findViewById(R.id.tv5);

            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();

        }

//        if ("168.8".equals(num1)) {
//            holder.rootView.setBackgroundColor(Color.parseColor("#ff0000"));
//        } else if ("168.7".equals(num1)) {
//            holder.rootView.setBackgroundColor(Color.parseColor("#00ff00"));
//            // 不加else图片会混乱
//        } else {
//            holder.rootView.setBackgroundColor(Color.parseColor("#ffffff"));
//        }

        holder.tv1.setText(bean.getNum());
        holder.tv2.setText(bean.getQuhua());
        holder.tv3.setText(bean.getPoint());
        holder.tv4.setText(bean.getNum1());
        holder.tv5.setText(bean.getNum2());

        return convertView;
    }

    public static class ViewHolder {


        public View rootView;
        public TextView tv1;
        public TextView tv2;
        public TextView tv3;
        public TextView tv4;
        public TextView tv5;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
        }
    }
}
