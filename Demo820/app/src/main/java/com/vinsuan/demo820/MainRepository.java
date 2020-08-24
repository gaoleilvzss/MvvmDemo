package com.vinsuan.demo820;

import com.vinsuan.demo820.model.ArticleModel;
import com.vinsuan.lib_base.base.BaseModel;
import com.vinsuan.lib_network.response.ApiResponse;

import io.reactivex.Observable;

/**
 * create by gaolei
 * on 2020/8/24
 */
public class MainRepository extends BaseModel implements MainHttpDataSource {
    private volatile static MainRepository INSTANCE = null;
    private MainHttpDataSource mDataSource;

    public MainRepository(MainHttpDataSource dataSource) {
        mDataSource = dataSource;
    }

    public static MainRepository getInstance(MainHttpDataSource httpDataSource) {
        if (INSTANCE == null) {
            synchronized (MainRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MainRepository(httpDataSource);
                }
            }
        }
        return INSTANCE;
    }


    @Override
    public Observable<ApiResponse<ArticleModel>> refresh(String page) {
        return mDataSource.refresh(page);
    }

    @Override
    public Observable<ApiResponse<ArticleModel>> loadMore() {
        return mDataSource.loadMore();
    }
}
