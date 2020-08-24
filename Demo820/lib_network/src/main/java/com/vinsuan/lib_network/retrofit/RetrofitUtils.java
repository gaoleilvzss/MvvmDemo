package com.vinsuan.lib_network.retrofit;

import android.text.TextUtils;

import com.vinsuan.lib_network.HttpsUtils;
import com.vinsuan.lib_network.intercepter.logging.Level;
import com.vinsuan.lib_network.intercepter.logging.LoggingInterceptor;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.internal.platform.Platform;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * create by gaolei
 * on 2020/8/21
 */
public class RetrofitUtils {
    private static final int DEFAULT_TIMEOUT = 20;
    private static RetrofitUtils instance;
    private static Retrofit retrofit;
    public static String baseUrl = "https://www.wanandroid.com/";
    private static OkHttpClient okHttpClient;

    private static class SingletonHolder {
        private static RetrofitUtils INSTANCE = new RetrofitUtils();
    }

    public static RetrofitUtils getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public RetrofitUtils() {
        this(baseUrl, null);
    }

    public RetrofitUtils(String url, Map<String, String> headers) {
        if (TextUtils.isEmpty(url)) {
            url = baseUrl;
        }
        HttpsUtils.SSLParams sslParams = HttpsUtils.getSslSocketFactory();
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new LoggingInterceptor
                        .Builder()//构建者模式
                        .loggable(true) //是否开启日志打印
                        .setLevel(Level.BASIC) //打印的等级
                        .log(Platform.INFO) // 打印类型
                        .request("Request") // request的Tag
                        .response("Response")// Response的Tag
                        .addHeader("log-header", "I am the log request header.") // 添加打印头, 注意 key 和 value 都不能是中文
                        .build()
                )
                .sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager)
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .build();

        retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(url)
                .build();
    }

    public <T> T create(final Class<T> service) {
        if (service == null) {
            throw new RuntimeException("Api service is null!");
        }
        return retrofit.create(service);
    }
}
