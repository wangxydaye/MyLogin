package com.bwei.mylian.model;

/**
 * Created by wonder on 2018/4/20.
 */

public interface LoginListener {
    void loginsuccess(String json);
    void loginerror(String error);
}
