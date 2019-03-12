package com.example.chenxin20190308.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * @Author 陈焮
 * @E-mail：
 * @Date：2019年3月8日08:44:43
 * @Description：封装BaseActivity方法
 */
public abstract class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        initView();
        initData();
        initLinsten();
    }

    //绑定布局
    protected abstract int initLayout();

    //绑定控件
    protected abstract void initView();

    //操作方法
    protected abstract void initData();

    //监听方法
    protected abstract void initLinsten();
}
