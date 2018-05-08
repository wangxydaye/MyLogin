package com.bwei.mylian.presenter;


import com.bwei.mylian.model.LoginModel;
import com.bwei.mylian.view.LoginView;
import com.bwei.mylian.view.RegView;

/**
 * Created by wonder on 2018/4/20.
 */

public interface LoginPresenter {
    void loginPresenter(LoginModel loginModel, LoginView loginView);
    void RegPresenter(LoginModel loginModel, RegView regView);
}
