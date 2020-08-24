package com.vinsuan.demo820.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder;
import com.vinsuan.demo820.R;
import com.vinsuan.demo820.databinding.RvItemLayoutBinding;
import com.vinsuan.demo820.model.RVItemModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * create by gaolei
 * on 2020/8/21
 */
public class RVItemAdapter extends BaseQuickAdapter<RVItemModel, BaseDataBindingHolder> {
    public RVItemAdapter( @Nullable List<RVItemModel> data) {
        super(R.layout.rv_item_layout, data);
    }

    @Override
    protected void convert(@NotNull BaseDataBindingHolder baseDataBindingHolder, RVItemModel rvItemModel) {
        RvItemLayoutBinding binding = (RvItemLayoutBinding) baseDataBindingHolder.getDataBinding();
        assert binding != null;
        binding.setModel(rvItemModel);
    }
}
