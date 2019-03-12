package com.example.chenxin20190308.tab;

import android.widget.ListView;
import android.widget.Toast;

import com.example.chenxin20190308.R;
import com.example.chenxin20190308.adapter.MyListAdapter;
import com.example.chenxin20190308.base.BaseFragment;
import com.example.chenxin20190308.bean.JavaBean;
import com.example.chenxin20190308.bean.MeData;
import com.example.chenxin20190308.util.HttpUtil;
import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import java.util.List;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019年3月8日09:32:31
 * @Description：解析数据进行展示
 */
public class HandFragment extends BaseFragment {

    private PullToRefreshListView plist;
    private String url="http://365jia.cn/news/api3/365jia/news/categories/hotnews?page=1";
    private List<MeData> data;
    private MyListAdapter adapter;

    protected int initLayout() {
        return R.layout.head_item;
    }

    //查找控件
    @Override
    protected void initView() {
        plist=getView().findViewById(R.id.plist);
    }

    //操作方法
    @Override
    protected void initData() {
        //设置允许上拉下拉方法
        plist.setScrollingWhileRefreshingEnabled(true);
        plist.setMode(PullToRefreshListView.Mode.BOTH);
        //解析数据
        HttpUtil.MyAsyncTask(url, new HttpUtil.CallBack() {
            @Override
            public void getData(String str) {
                Gson gson=new Gson();
                JavaBean javaBean = gson.fromJson(str, JavaBean.class);
                data = javaBean.getData().getData();
                //创建适配器
                adapter = new MyListAdapter(getActivity(),data);
                //设置适配器
                plist.setAdapter(adapter);
            }
        });
    }

    @Override
    protected void initLinsten() {
        //设置上拉下拉
        plist.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                HttpUtil.MyAsyncTask(url, new HttpUtil.CallBack() {
                    @Override
                    public void getData(String str) {
                        Gson gson=new Gson();
                        JavaBean javaBean = gson.fromJson(str, JavaBean.class);
                        data = javaBean.getData().getData();
                        //创建适配器
                        adapter = new MyListAdapter(getActivity(),data);
                        //设置适配器
                        plist.setAdapter(adapter);
                        plist.onRefreshComplete();
                    }
                });
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                HttpUtil.MyAsyncTask(url, new HttpUtil.CallBack() {
                    @Override
                    public void getData(String str) {
                        Gson gson=new Gson();
                        JavaBean javaBean = gson.fromJson(str, JavaBean.class);
                        List<MeData> list = javaBean.getData().getData();
                        data.addAll(list);
                        //创建适配器
                        adapter = new MyListAdapter(getActivity(),data);
                        //刷新适配器
                        adapter.notifyDataSetChanged();
                        plist.onRefreshComplete();
                    }
                });
            }
        });
    }

}
