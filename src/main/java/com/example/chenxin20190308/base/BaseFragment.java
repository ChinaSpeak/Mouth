package com.example.chenxin20190308.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019/3/8 8:45
 * @Description：描述信息
 */
public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(initLayout(),container,false);
    }

    //绑定布局
    protected abstract int initLayout();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initLinsten();
    }

    //绑定控件
    protected abstract void initView();

    //操作方法
    protected abstract void initData();

    //监听方法
    protected abstract void initLinsten();
}
