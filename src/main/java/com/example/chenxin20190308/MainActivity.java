package com.example.chenxin20190308;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.chenxin20190308.base.BaseActivity;
import com.example.chenxin20190308.fragment.Frag01;
import com.example.chenxin20190308.fragment.Frag02;
import com.example.chenxin20190308.fragment.Frag03;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private RadioGroup radio_group;
    private Frag01 frag01;
    private Frag02 frag02;
    private Frag03 frag03;
    private FragmentManager manager;

    //绑定布局
    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    //查找控件
    @Override
    protected void initView() {
        radio_group=findViewById(R.id.radio_group);
    }

    //操作方法
    @Override
    protected void initData() {
        frag01 = new Frag01();
        frag02 = new Frag02();
        frag03 = new Frag03();
        //获取管理者
        manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.fragment_layout,frag01)
                .add(R.id.fragment_layout,frag02)
                .add(R.id.fragment_layout,frag03)
                .show(frag01)
                .hide(frag02)
                .hide(frag03).commit();
    }

    @Override
    protected void initLinsten() {
        //点击切换
        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = manager.beginTransaction();
                switch (checkedId){
                    case R.id.rd1:
                        transaction.show(frag01)
                                .hide(frag02)
                                .hide(frag03);
                        break;
                    case R.id.rd2:
                        transaction.show(frag02)
                                .hide(frag01)
                                .hide(frag03);
                        break;
                    case R.id.rd3:
                        transaction.show(frag03)
                                .hide(frag01)
                                .hide(frag02);
                        break;
                }
                transaction.commit();
            }
        });
    }
}
