package com.vinsuan.demo820.api;

import com.vinsuan.demo820.model.ArticleModel;
import com.vinsuan.lib_network.response.ApiResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * create by gaolei
 * on 2020/8/21
 */
public interface WanApi {
    @GET("article/list/{page}/json")
    Observable<ApiResponse<ArticleModel>> getList(@Path("page") String page);
}
