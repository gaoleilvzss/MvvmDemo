package com.vinsuan.demo820;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/**
 * create by gaolei
 * on 2020/8/24
 */
public class AppViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private static volatile AppViewModelFactory INSTANCE;
    private final MainRepository mRepository;

    public static AppViewModelFactory getInstance() {
        if (INSTANCE == null) {
            synchronized (AppViewModelFactory.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AppViewModelFactory(Injection.provideDemoRepository());
                }
            }
        }
        return INSTANCE;
    }

    private AppViewModelFactory(MainRepository repository) {
        this.mRepository = repository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainViewModel.class)) {
            return (T) new MainViewModel(mRepository);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
