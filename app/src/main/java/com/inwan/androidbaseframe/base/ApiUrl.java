package com.inwan.androidbaseframe.base;

import com.inwan.androidbaseframe.model.LoginModel;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * author : Administrator
 * date : 2020/4/23 0023 17:20
 * description :
 */

public interface ApiUrl {

    @FormUrlEncoded
    @POST("share/public/login")
    Observable<BaseModel<LoginModel>> login(@FieldMap Map<String, Object> map);
}
