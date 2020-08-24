package com.vinsuan.lib_base.adapter.recyclerview;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;

import java.util.List;

/**
 * create by gaolei
 * on 2020/8/21
 */
public class RecyclerViewBindingAdapter {
    @BindingAdapter(value = {"adapter", "layoutManager","itemClick"})
    public static void setRecyclerViewSomeThing(RecyclerView rv, BaseQuickAdapter adapter, RecyclerView.LayoutManager layoutManager, OnItemClickListener listener) {
        rv.setLayoutManager(layoutManager);
        adapter.setAnimationEnable(true);
        adapter.setOnItemClickListener(listener);
        rv.setAdapter(adapter);
    }
}
