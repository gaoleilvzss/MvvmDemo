package com.vinsuan.demo820.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.vinsuan.demo820.R;
import com.vinsuan.demo820.databinding.ArticleDetailLayoutBinding;

/**
 * create by gaolei
 * on 2020/8/24
 */
public class ArticleDetailActivity extends AppCompatActivity {
    ArticleDetailLayoutBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.article_detail_layout);
        String url = getIntent().getStringExtra("link");
        binding.setUrl(url);
        binding.back.setOnClickListener(v -> finish());
    }
}
