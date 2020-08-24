package com.vinsuan.lib_network.response;

/**
 * create by gaolei
 * on 2020/8/21
 */
public class ApiResponse<T> {
    public int errorCode;
    public String errorMsg;
    public T data;
}
