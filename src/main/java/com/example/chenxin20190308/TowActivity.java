package com.example.chenxin20190308;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chenxin20190308.adapter.MyGridAdapter;
import com.example.chenxin20190308.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class TowActivity extends BaseActivity {

    private ImageView imageView;
    private TextView textView;
    private GridView grid_top,grid_down;
    private MyGridAdapter adapterT;
    private MyGridAdapter adapterD;
    private ArrayList<String> listT;
    private ArrayList<String> listD;

    //绑定视图
    @Override
    protected int initLayout() {
        return R.layout.activity_tow;
    }

    //查找控件
    @Override
    protected void initView() {
       imageView= findViewById(R.id.image_top);
        textView=findViewById(R.id.text_top);
        grid_top=findViewById(R.id.grid_top);
        grid_down=findViewById(R.id.grid_down);

    }

    //操作方法
    @Override
    protected void initData() {
        //接收传值
        Intent intent = getIntent();
        listT = intent.getStringArrayListExtra("key");
        //创建集合模拟数据
        listD = new ArrayList<>();
        for (int i=0;i<10;i++){
            listD.add("频道"+i);
        }
        //创建适配器
        adapterT = new MyGridAdapter(TowActivity.this, listT);
        adapterD = new MyGridAdapter(TowActivity.this, listD);
        //设置适配器
        grid_down.setAdapter(adapterD);
        grid_top.setAdapter(adapterT);
    }

    //监听方法
    @Override
    protected void initLinsten() {
        //点击自条目
        grid_top.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //获取点击资源
                String str = listT.get(position);
                //删除点击资源
                listT.remove(position);
                //第二列表添加资源
                listD.add(str);
                //刷新适配器
                adapterD.notifyDataSetChanged();
                adapterT.notifyDataSetChanged();
            }
        });

        grid_down.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //获取点击资源
                String str = listD.get(position);
                //删除点击资源
                listD.remove(position);
                //第二列表添加资源
                listT.add(str);
                //刷新适配器
                adapterD.notifyDataSetChanged();
                adapterT.notifyDataSetChanged();
            }
        });

        //点击文字进行跳转传值
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putStringArrayListExtra("name",listT);
                setResult(90,intent);
                finish();
            }
        });

        //点击图片进行返回
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
