package com.vinsuan.lib_base.adapter.webview;

import android.text.TextUtils;
import android.webkit.WebView;

import androidx.databinding.BindingAdapter;

/**
 * create by gaolei
 * on 2020/8/24
 */
public class WebViewBindingAdapter {
    @BindingAdapter({"render"})
    public static void loadHtml(WebView webView, final String url) {
        webView.loadUrl(url);
    }
}
