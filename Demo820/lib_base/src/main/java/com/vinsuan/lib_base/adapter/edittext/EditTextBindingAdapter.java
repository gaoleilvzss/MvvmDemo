package com.vinsuan.lib_base.adapter.edittext;

import android.text.TextWatcher;
import android.widget.EditText;

import androidx.databinding.BindingAdapter;

/**
 * create by gaolei
 * on 2020/8/21
 */
public class EditTextBindingAdapter {
    @BindingAdapter(value = {"textWatcher"})
    public static void setEditTextWatcher(EditText editText, TextWatcher textWatcher) {
        if (textWatcher != null) {
            editText.addTextChangedListener(textWatcher);
        }
    }
}
