package com.vinsuan.demo820;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.vinsuan.demo820.databinding.ItemLayoutBinding;
import com.vinsuan.lib_base.base.BaseActivity;

public class MainActivity extends BaseActivity<ItemLayoutBinding, MainViewModel> {
    @Override
    protected MainViewModel getViewModel() {
        AppViewModelFactory factory = AppViewModelFactory.getInstance();
        return ViewModelProviders.of(this,factory).get(MainViewModel.class);
    }

    @Override
    protected int getViewModelId() {
        return BR.test;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_layout;
    }
}