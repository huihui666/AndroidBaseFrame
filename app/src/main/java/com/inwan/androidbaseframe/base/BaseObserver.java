package com.inwan.androidbaseframe.base;

/**
 * author : Administrator
 * date : 2020/4/23 0023 17:21
 * description :
 */

import android.util.Log;

import com.inwan.androidbaseframe.http.RxExceptionUtil;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 创建Base抽象类实现Observer
 */
public abstract class BaseObserver<T> implements Observer<BaseModel<T>> {
    private static final String TAG = "BaseObserver";

    @Override
    public void onSubscribe(Disposable d) {
        Log.e(TAG, "onSubscribe: ");
    }

    @Override
    public void onNext(BaseModel<T> response) {
        //在这边对 基础数据 进行统一处理  举个例子：
        if (response.getCode() == 0) {
            onSuccess(response.getData());
        } else {
            onFailure(null, response.getMsg());
        }
    }

    @Override
    public void onError(Throwable e) {//服务器错误信息处理
        onFailure(e, RxExceptionUtil.exceptionHandler(e));
    }

    @Override
    public void onComplete() {
        Log.e(TAG, "onComplete: ");
    }

    public abstract void onSuccess(T demo);

    public abstract void onFailure(Throwable e, String errorMsg);
}
