package com.vinsuan.lib_base.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import java.util.Map;


/**
 * create by gaolei
 * on 2020/8/21
 */
public abstract class BaseActivity<V extends ViewDataBinding, VM extends BaseViewModel> extends FragmentActivity {
    protected V viewDataBinding;
    protected VM viewModel;
    protected int viewModelId;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding(savedInstanceState);
        registorUIChangeLiveDataCallBack();
    }

    private void registorUIChangeLiveDataCallBack() {
        //跳入新页面
        viewModel.getUC().getStartActivityEvent().observe(this, new Observer<Map<String, Object>>() {
            @Override
            public void onChanged(@Nullable Map<String, Object> params) {
                Class<?> clz = (Class<?>) params.get(BaseViewModel.ParameterField.CLASS);
                Bundle bundle = (Bundle) params.get(BaseViewModel.ParameterField.BUNDLE);
                startActivity(clz, bundle);
            }
        });

    }

    private void initDataBinding(Bundle savedInstanceState) {
        viewDataBinding = DataBindingUtil.setContentView(this, getLayoutId());
        viewModelId = getViewModelId();
        viewModel = getViewModel();
        viewDataBinding.setVariable(viewModelId,viewModel);
    }

    protected abstract VM getViewModel();

    protected abstract int getViewModelId();

    public abstract int getLayoutId();

    public void startActivity(Class<?> clz, Bundle bundle) {
        Intent intent = new Intent(this, clz);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

}
