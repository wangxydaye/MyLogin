package com.bwei.mylian.view;

/**
 * Created by wonder on 2018/5/8.
 */

public interface LoginView {
    String getMobile();
    String getPassWord();
    void LoginSuccess();
    void LoginError();
}
