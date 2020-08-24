package com.vinsuan.demo820;

import com.vinsuan.demo820.model.ArticleModel;
import com.vinsuan.lib_network.response.ApiResponse;

import io.reactivex.Observable;

/**
 * create by gaolei
 * on 2020/8/24
 */
public interface MainHttpDataSource {
    Observable<ApiResponse<ArticleModel>> refresh(String page);
    Observable<ApiResponse<ArticleModel>> loadMore();
}
