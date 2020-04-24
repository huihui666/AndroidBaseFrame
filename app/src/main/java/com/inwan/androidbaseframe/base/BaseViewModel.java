package com.inwan.androidbaseframe.base;

import android.app.Application;

import androidx.annotation.NonNull;

import com.rxjava.rxlife.RxLife;
import com.rxjava.rxlife.ScopeViewModel;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * author : Administrator
 * date : 2020/4/24 0024 10:46
 * description :
 */
public abstract class BaseViewModel extends ScopeViewModel {

    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    protected <T> void subscribe(Observable<BaseModel<T>> observable, DialogObserver<T> consumer) {
        observable
                .subscribeOn(Schedulers.io())
//                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .as(RxLife.asOnMain(this)).subscribe(consumer);
    }
}
