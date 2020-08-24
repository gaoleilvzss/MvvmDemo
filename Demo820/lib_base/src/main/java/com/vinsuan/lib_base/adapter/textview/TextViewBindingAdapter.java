package com.vinsuan.lib_base.adapter.textview;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.jakewharton.rxbinding2.view.RxView;

import java.util.concurrent.TimeUnit;

import io.reactivex.functions.Consumer;

/**
 * create by gaolei
 * on 2020/8/21
 */
public class TextViewBindingAdapter {

    public static final int CLICK_INTERVAL = 1;

    @SuppressLint("CheckResult")
    @BindingAdapter(value = {"onClickCommand", "isThrottleFirst"}, requireAll = false)
    public static void setClick(TextView textView, View.OnClickListener listener, boolean isThrottleFirst) {
        textView.setOnClickListener(listener);
//        if (isThrottleFirst) {
//            RxView.clicks(textView).subscribe(o -> textView.setOnClickListener(listener));
//        } else {
//            RxView.clicks(textView).throttleFirst(CLICK_INTERVAL, TimeUnit.SECONDS).subscribe(o -> textView.setOnClickListener(listener));
//        }
    }
}
