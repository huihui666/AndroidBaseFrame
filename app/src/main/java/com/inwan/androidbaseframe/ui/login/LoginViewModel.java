package com.inwan.androidbaseframe.ui.login;

import android.app.Application;

import androidx.annotation.NonNull;

import com.inwan.androidbaseframe.base.BaseViewModel;
import com.inwan.androidbaseframe.base.DialogObserver;
import com.inwan.androidbaseframe.http.RetrofitUtils;
import com.inwan.androidbaseframe.model.LoginModel;

import java.util.HashMap;
import java.util.Map;

/**
 * author : Administrator
 * date : 2020/4/24 0024 11:28
 * description :
 */
public class LoginViewModel extends BaseViewModel {
    private Map<String, Object> map = new HashMap<>();

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }

    void login(String keywords, DialogObserver<LoginModel> observer) {
        map.clear();
        map.put("keywords", keywords);
        subscribe(RetrofitUtils.getApiUrl().login(map), observer);
    }
}
