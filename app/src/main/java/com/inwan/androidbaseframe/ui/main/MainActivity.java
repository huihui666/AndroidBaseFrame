package com.inwan.androidbaseframe.ui.main;

import android.content.Intent;
import android.widget.TextView;

import com.inwan.androidbaseframe.R;
import com.inwan.androidbaseframe.base.BaseActivity;
import com.inwan.androidbaseframe.ui.login.LoginActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tv_hello)
    TextView tvHello;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.tv_hello)
    public void onViewClicked() {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
