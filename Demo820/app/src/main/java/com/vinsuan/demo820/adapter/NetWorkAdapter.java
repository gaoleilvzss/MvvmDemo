package com.vinsuan.demo820.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder;
import com.vinsuan.demo820.R;
import com.vinsuan.demo820.databinding.ArticleLayoutBinding;
import com.vinsuan.demo820.model.ArticleModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * create by gaolei
 * on 2020/8/24
 */
public class NetWorkAdapter extends BaseQuickAdapter<ArticleModel.DatasBean, BaseDataBindingHolder> implements LoadMoreModule {
    public NetWorkAdapter(@Nullable List<ArticleModel.DatasBean> data) {
        super(R.layout.article_layout, data);
    }

    @Override
    protected void convert(@NotNull BaseDataBindingHolder baseDataBindingHolder, ArticleModel.DatasBean articleModel) {
        ArticleLayoutBinding binding = (ArticleLayoutBinding) baseDataBindingHolder.getDataBinding();
        assert binding != null;
        binding.setModel(articleModel);
    }
}
