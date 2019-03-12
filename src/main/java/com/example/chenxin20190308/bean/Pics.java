package com.example.chenxin20190308.bean;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019/3/8 9:55
 * @Description：描述信息
 */
public class Pics {
    private String pics;

    @Override
    public String toString() {
        return "Pics{" +
                "pics='" + pics + '\'' +
                '}';
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics;
    }

    public Pics(String pics) {

        this.pics = pics;
    }
}
