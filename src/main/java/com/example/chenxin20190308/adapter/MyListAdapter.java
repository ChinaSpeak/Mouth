package com.example.chenxin20190308.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.chenxin20190308.R;
import com.example.chenxin20190308.bean.MeData;
import com.example.chenxin20190308.bean.MyData;

import java.util.List;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019/3/8 9:44
 * @Description：描述信息
 */
public class MyListAdapter extends BaseAdapter {

    private Context context;
    private List<MeData> list;

    public MyListAdapter(Context context, List<MeData> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int type = getItemViewType(position);
        switch (type) {
            case 0:
                ViewHolder0 holder0;
                if (convertView == null) {
                    convertView = View.inflate(context, R.layout.itme01, null);
                    holder0 = new ViewHolder0();
                    holder0.imageView0 = convertView.findViewById(R.id.image01);
                    holder0.textView0 = convertView.findViewById(R.id.text01);
                    convertView.setTag(holder0);
                } else {
                    holder0 = (ViewHolder0) convertView.getTag();
                }
                //赋值
                holder0.textView0.setText(list.get(position).getViews());
                Glide.with(convertView).load("http://img.365jia.cn/uploads/special/tuku/201806/5b247f05646c345194.jpg").into(holder0.imageView0);
                break;
            case 1:
                ViewHolder1 holder1;
                if (convertView == null) {
                    convertView = View.inflate(context, R.layout.itme02, null);
                    holder1 = new ViewHolder1();
                    holder1.imageView1 = convertView.findViewById(R.id.image02);
                    holder1.textView1 = convertView.findViewById(R.id.text02);
                    convertView.setTag(holder1);
                } else {
                    holder1 = (ViewHolder1) convertView.getTag();
                }
                //赋值
                holder1.textView1.setText(list.get(position).getId());
                Glide.with(convertView).load("http://img.365jia.cn/uploads/special/tuku/201806/5b247f05646c345194.jpg").into(holder1.imageView1);
                break;
            case 2:
                ViewHolder2 holder2;
                if (convertView == null) {
                    convertView = View.inflate(context, R.layout.itme03, null);
                    holder2 = new ViewHolder2();
                    holder2.imageView2 = convertView.findViewById(R.id.image03);
                    holder2.textView2 = convertView.findViewById(R.id.text03);
                    convertView.setTag(holder2);
                } else {
                    holder2 = (ViewHolder2) convertView.getTag();
                }
                //赋值
                holder2.textView2.setText(list.get(position).getType());
                Glide.with(convertView).load("http://img.365jia.cn/uploads/special/tuku/201806/5b247f05646c345194.jpg").into(holder2.imageView2);
                break;
        }
        return convertView;
    }

    class ViewHolder0 {
        TextView textView0;
        ImageView imageView0;
    }

    class ViewHolder1 {
        TextView textView1;
        ImageView imageView1;
    }

    class ViewHolder2 {
        TextView textView2;
        ImageView imageView2;
    }

    @Override
    public int getItemViewType(int position) {
        return position % 3;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }
}
