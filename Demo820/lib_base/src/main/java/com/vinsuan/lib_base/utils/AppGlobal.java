package com.vinsuan.lib_base.utils;

import android.app.Application;

/**
 * create by gaolei
 * on 2020/8/21
 */
public class AppGlobal {
    private static Application sApplication;

    public static Application get() {
        if (sApplication == null) {
            try {
                sApplication = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication").invoke(null, (Object[]) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sApplication;
    }
}
