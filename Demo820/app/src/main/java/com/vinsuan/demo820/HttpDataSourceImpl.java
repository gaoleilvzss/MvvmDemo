package com.vinsuan.demo820;

import com.vinsuan.demo820.api.WanApi;
import com.vinsuan.demo820.model.ArticleModel;
import com.vinsuan.lib_network.response.ApiResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by goldze on 2019/3/26.
 */
public class HttpDataSourceImpl implements MainHttpDataSource {
    private WanApi apiService;
    private volatile static HttpDataSourceImpl INSTANCE = null;

    public static HttpDataSourceImpl getInstance(WanApi apiService) {
        if (INSTANCE == null) {
            synchronized (HttpDataSourceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new HttpDataSourceImpl(apiService);
                }
            }
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    private HttpDataSourceImpl(WanApi apiService) {
        this.apiService = apiService;
    }


    @Override
    public Observable<ApiResponse<ArticleModel>> refresh(String page) {
        return apiService.getList(page);
    }

    @Override
    public Observable<ApiResponse<ArticleModel>> loadMore() {
        return apiService.getList("0");
    }
}
