package com.example.chenxin20190308.fragment;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.chenxin20190308.R;
import com.example.chenxin20190308.TowActivity;
import com.example.chenxin20190308.adapter.MyTabAdapter;
import com.example.chenxin20190308.base.BaseFragment;
import com.example.chenxin20190308.tab.HandFragment;
import com.example.chenxin20190308.tab.NewsFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019年3月8日09:06:41
 * @Description：Tab切换和
 */
public class Frag01 extends BaseFragment {

    private TabLayout tablayout;
    private ImageView image_view;
    private ViewPager view_page;
    private List<Fragment> listF;
    private List<String> listT;
    private MyTabAdapter adapter;

    @Override
    protected int initLayout() {
        return R.layout.frag01_layout;
    }

    //查找控件
    @Override
    protected void initView() {
        tablayout=getView().findViewById(R.id.tabLayout);
        image_view=getView().findViewById(R.id.image_01);
        view_page=getView().findViewById(R.id.view_page);
    }

    //操作数据
    @Override
    protected void initData() {
        //创建集合
        listF = new ArrayList<>();
        listF.add(new HandFragment());
        listF.add(new NewsFragment());
        //创建Tab集合
        listT = new ArrayList<>();
        listT.add("头条");
        listT.add("新闻");
        //创建适配器
        adapter = new MyTabAdapter(getActivity().getSupportFragmentManager(),listF,listT);
        //设置适配器
        view_page.setAdapter(adapter);
        //关联
        tablayout.setupWithViewPager(view_page);
        //设置图片
        Glide.with(getActivity()).load("http://img.365jia.cn/uploads/special/tuku/201806/5b247f05646c345194.jpg").into(image_view);

    }

    @Override
    protected void initLinsten() {
        //图片点击事件
        image_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),TowActivity.class);
                intent.putStringArrayListExtra("key",(ArrayList)listT);
                startActivityForResult(intent,100);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==100&&resultCode==90){
            ArrayList<String> name = data.getStringArrayListExtra("name");
            //清除内容
            listT.clear();
            listF.clear();
            //重新添加数据
            listT.addAll(name);
            for (int i=0;i<listT.size();i++){
                TabLayout.Tab tab=tablayout.newTab();
                tablayout.addTab(tab);
                if (i==0){
                    listF.add(new HandFragment());
                }else {
                    listF.add(new NewsFragment());
                }
            }
            //刷新适配器
            adapter.notifyDataSetChanged();
        }
    }
}
