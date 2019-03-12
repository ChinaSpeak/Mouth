package com.example.chenxin20190308.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.chenxin20190308.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019/3/8 10:27
 * @Description：描述信息
 */
public class MyGridAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> list;

    public MyGridAdapter(Context context, ArrayList<String> list) {
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
        ViewHolder holder;
        if (convertView==null){
            convertView=View.inflate(context, R.layout.grid_layout,null);
            holder=new ViewHolder();
            holder.textView=convertView.findViewById(R.id.grid_text);
            convertView.setTag(holder);
        }else {
            holder=(ViewHolder) convertView.getTag();
        }
        holder.textView.setText(list.get(position));
        return convertView;
    }

    class ViewHolder{
        TextView textView;
    }
}
