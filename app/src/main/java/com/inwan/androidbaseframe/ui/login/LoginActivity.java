package com.inwan.androidbaseframe.ui.login;

import com.inwan.androidbaseframe.R;
import com.inwan.androidbaseframe.base.BaseActivity;
import com.inwan.androidbaseframe.base.DialogObserver;
import com.inwan.androidbaseframe.model.LoginModel;

public class LoginActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initData() {
        LoginViewModel viewModel = getViewModel(LoginViewModel.class);

        viewModel.login("ac2019", new DialogObserver<LoginModel>(this) {
            @Override
            public void onSuccess(LoginModel demo) {

            }

            @Override
            public void onFailure(Throwable e, String errorMsg) {

            }
        });
    }
}
