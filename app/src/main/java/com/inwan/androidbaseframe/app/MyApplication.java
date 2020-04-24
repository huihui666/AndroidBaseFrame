package com.inwan.androidbaseframe.app;

import android.app.Application;
import android.content.Context;

import com.inwan.androidbaseframe.utils.LogUtil;
import com.inwan.androidbaseframe.utils.SharedPreferencesUtil;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;

/**
 * author : Administrator
 * date : 2020/4/24 0024 14:16
 * description :
 */
public class MyApplication extends Application {

    private static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppContext = getApplicationContext();

        LogUtil.setDebug(true);
        SharedPreferencesUtil.getInstance(this, "SPUtil");
    }

    public static Context getAppContext() {
        return mAppContext;
    }

    //static 代码段可以防止内存泄露
    static {
        //设置全局的Header构建器
        SmartRefreshLayout.setDefaultRefreshHeaderCreator((context, layout) -> new ClassicsHeader(context).setSpinnerStyle(SpinnerStyle.Translate));
        //设置全局的Footer构建器
        SmartRefreshLayout.setDefaultRefreshFooterCreator((context, layout) -> new ClassicsFooter(context).setSpinnerStyle(SpinnerStyle.Translate));
    }
}
