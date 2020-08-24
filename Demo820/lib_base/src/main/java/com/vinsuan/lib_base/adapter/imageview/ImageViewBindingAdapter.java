package com.vinsuan.lib_base.adapter.imageview;

import android.text.TextUtils;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

/**
 * create by gaolei
 * on 2020/8/21
 */
public final class ImageViewBindingAdapter {
    @BindingAdapter(value = {"url"}, requireAll = false)
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .placeholder(com.vinsuan.lib_res.R.drawable.placeholder)
                .error(com.vinsuan.lib_res.R.drawable.placeholder)
                .into(imageView);
    }
}

