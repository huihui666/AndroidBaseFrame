package com.inwan.androidbaseframe.base;

/**
 * author : Administrator
 * date : 2020/4/24 0024 10:48
 * description :
 */
public class BaseModel<T> {
    private int code;
    private String msg;
    private String exe_time;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg == null ? "" : msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getExe_time() {
        return exe_time == null ? "" : exe_time;
    }

    public void setExe_time(String exe_time) {
        this.exe_time = exe_time;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
