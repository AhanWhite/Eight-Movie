package com.ahan;

import android.app.Application;

/**
 * Created by Weli on 2018/6/26.
 */

public class MyApplication extends Application
{
    private static MyApplication myApplication;
    public static MyApplication getInstance() {

        return myApplication;
    }
    @Override
    public void onCreate()
    {
        super.onCreate();

//        OkHttpClient okHttpClient = new OkHttpClient.Builder()
////                .addInterceptor(new LoggerInterceptor("TAG"))
//                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
//                .readTimeout(10000L, TimeUnit.MILLISECONDS)
//                //其他配置
//                .build();
//
//        OkHttpUtils.initClient(okHttpClient);

    }
}