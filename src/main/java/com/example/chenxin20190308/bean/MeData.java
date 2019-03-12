package com.example.chenxin20190308.bean;

import java.util.List;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019/3/8 9:38
 * @Description：描述信息
 */
public class MeData {

    private String alias;
    private String catalog_name;
    private String comment_amount_label;
    private String id;
    private String inner_news;
    private String link;
    private String pic_amount;
    private String source;
    private String style;
    private String t;
    private List<String> pics;
    private String title;
    private String type;
    private String type_sign;
    private String views;
    private String views_label;

    @Override
    public String toString() {
        return "MeData{" +
                "alias='" + alias + '\'' +
                ", catalog_name='" + catalog_name + '\'' +
                ", comment_amount_label='" + comment_amount_label + '\'' +
                ", id='" + id + '\'' +
                ", inner_news='" + inner_news + '\'' +
                ", link='" + link + '\'' +
                ", pic_amount='" + pic_amount + '\'' +
                ", source='" + source + '\'' +
                ", style='" + style + '\'' +
                ", t='" + t + '\'' +
                ", pics=" + pics +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", type_sign='" + type_sign + '\'' +
                ", views='" + views + '\'' +
                ", views_label='" + views_label + '\'' +
                '}';
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCatalog_name() {
        return catalog_name;
    }

    public void setCatalog_name(String catalog_name) {
        this.catalog_name = catalog_name;
    }

    public String getComment_amount_label() {
        return comment_amount_label;
    }

    public void setComment_amount_label(String comment_amount_label) {
        this.comment_amount_label = comment_amount_label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInner_news() {
        return inner_news;
    }

    public void setInner_news(String inner_news) {
        this.inner_news = inner_news;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPic_amount() {
        return pic_amount;
    }

    public void setPic_amount(String pic_amount) {
        this.pic_amount = pic_amount;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public List<String> getPics() {
        return pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_sign() {
        return type_sign;
    }

    public void setType_sign(String type_sign) {
        this.type_sign = type_sign;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getViews_label() {
        return views_label;
    }

    public void setViews_label(String views_label) {
        this.views_label = views_label;
    }

    public MeData(String alias, String catalog_name, String comment_amount_label, String id, String inner_news, String link, String pic_amount, String source, String style, String t, List<String> pics, String title, String type, String type_sign, String views, String views_label) {

        this.alias = alias;
        this.catalog_name = catalog_name;
        this.comment_amount_label = comment_amount_label;
        this.id = id;
        this.inner_news = inner_news;
        this.link = link;
        this.pic_amount = pic_amount;
        this.source = source;
        this.style = style;
        this.t = t;
        this.pics = pics;
        this.title = title;
        this.type = type;
        this.type_sign = type_sign;
        this.views = views;
        this.views_label = views_label;
    }
}
