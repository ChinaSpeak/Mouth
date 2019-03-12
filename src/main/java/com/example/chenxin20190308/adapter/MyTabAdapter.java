package com.example.chenxin20190308.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019/3/8 9:17
 * @Description：描述信息
 */
public class MyTabAdapter extends FragmentPagerAdapter {

    private List<Fragment> list;
    private List<String> al;

    public MyTabAdapter(FragmentManager fm, List<Fragment> list, List<String> al) {
        super(fm);
        this.list = list;
        this.al = al;
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return al.get(position);
    }
}
