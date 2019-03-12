package com.example.chenxin20190308.util;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author：呵 呵
 * @E-mail：
 * @Date：2019年3月8日09:24:40
 * @Description：封装HttpURLConnection网络请求工具类
 */
public class HttpUtil {

    //请求数据
    public static String getHttp(String strUrl){

        //将URL转化为String
        try {
            URL url=new URL(strUrl);
            HttpURLConnection connection=(HttpURLConnection) url.openConnection();
            //设置超时时间
            connection.setConnectTimeout(5000);
            //设置读取超时时间
            connection.setReadTimeout(5000);
            //设置请求方式
            connection.setRequestMethod("GET");
            //判断请求码
            if (connection.getResponseCode()==200){
                InputStream inputStream = connection.getInputStream();
                InputStreamReader streamReader=new InputStreamReader(inputStream);
                BufferedReader reader=new BufferedReader(streamReader);
                StringBuffer buffer=new StringBuffer();
                String s="";
                while ((s=reader.readLine())!=null){
                    buffer.append(s);
                }
                return buffer.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //创建接口
    public interface CallBack{
        void getData(String str);
    }

    //封装异步请求
    public static void MyAsyncTask(String url, final CallBack callBack){

        new AsyncTask<String,Void,String>(){
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                callBack.getData(s);
            }

            @Override
            protected String doInBackground(String... strings) {
                return getHttp(strings[0]);
            }
        }.execute(url);

    }

}
