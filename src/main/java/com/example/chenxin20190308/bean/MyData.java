package com.example.chenxin20190308.bean;

import java.util.List;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019/3/8 9:36
 * @Description：描述信息
 */
public class MyData {

    private String max_page;
    private String page;
    private String perpage;
    private String total;
    private List<MeData> data;

    @Override
    public String toString() {
        return "MyData{" +
                "max_page='" + max_page + '\'' +
                ", page='" + page + '\'' +
                ", perpage='" + perpage + '\'' +
                ", total='" + total + '\'' +
                ", data=" + data +
                '}';
    }

    public String getMax_page() {
        return max_page;
    }

    public void setMax_page(String max_page) {
        this.max_page = max_page;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPerpage() {
        return perpage;
    }

    public void setPerpage(String perpage) {
        this.perpage = perpage;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<MeData> getData() {
        return data;
    }

    public void setData(List<MeData> data) {
        this.data = data;
    }

    public MyData(String max_page, String page, String perpage, String total, List<MeData> data) {

        this.max_page = max_page;
        this.page = page;
        this.perpage = perpage;
        this.total = total;
        this.data = data;
    }
}
