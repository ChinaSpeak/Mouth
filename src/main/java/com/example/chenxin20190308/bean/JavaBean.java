package com.example.chenxin20190308.bean;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019/3/8 9:34
 * @Description：描述信息
 */
public class JavaBean {

    private String code;
    private String httpStatusCode;
    private MyData data;

    @Override
    public String toString() {
        return "JavaBean{" +
                "code='" + code + '\'' +
                ", httpStatusCode='" + httpStatusCode + '\'' +
                ", data=" + data +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public MyData getData() {
        return data;
    }

    public void setData(MyData data) {
        this.data = data;
    }

    public JavaBean(String code, String httpStatusCode, MyData data) {

        this.code = code;
        this.httpStatusCode = httpStatusCode;
        this.data = data;
    }
}
