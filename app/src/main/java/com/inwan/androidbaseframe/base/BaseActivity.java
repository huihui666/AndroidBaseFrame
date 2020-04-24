package com.inwan.androidbaseframe.base;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.inwan.androidbaseframe.utils.ScreenUtils;

import butterknife.ButterKnife;

/**
 * author : Administrator
 * date : 2020/4/24 0024 10:45
 * description :
 */
public abstract class BaseActivity extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);

        ScreenUtils.setStatusBarTransparent(this);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //设置屏幕不可旋转

        initData();
    }

    protected abstract int getLayoutId();

    protected abstract void initData();

    protected <T extends ViewModel> T getViewModel(Class<T> clazz) {
        return new ViewModelProvider(this).get(clazz);
    }
}
