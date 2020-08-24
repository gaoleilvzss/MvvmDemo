package com.vinsuan.demo820;

import com.vinsuan.demo820.api.WanApi;
import com.vinsuan.lib_network.retrofit.RetrofitUtils;


/**
 * 注入全局的数据仓库，可以考虑使用Dagger2。（根据项目实际情况搭建，千万不要为了架构而架构）
 * Created by goldze on 2019/3/26.
 */
public class Injection {
    public static MainRepository provideDemoRepository() {
        //网络API服务
        WanApi apiService = RetrofitUtils.getInstance().create(WanApi.class);
        //网络数据源
        MainHttpDataSource httpDataSource = HttpDataSourceImpl.getInstance(apiService);
        return MainRepository.getInstance(httpDataSource);
    }
}
