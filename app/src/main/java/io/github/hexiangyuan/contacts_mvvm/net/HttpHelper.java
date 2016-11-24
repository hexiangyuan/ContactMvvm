package io.github.hexiangyuan.contacts_mvvm.net;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-24
 */

public class HttpHelper {
    private static String url = "https://api.randomuser.me/";

    private static Retrofit RETROFIT = new Retrofit.Builder().baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();

    public static Retrofit getHttpInstance() {
        return RETROFIT;
    }

    public static void changeUrl(String url) {
        RETROFIT = new Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
}
