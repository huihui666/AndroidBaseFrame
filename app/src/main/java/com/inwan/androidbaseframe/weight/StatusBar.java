package com.inwan.androidbaseframe.weight;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

/**
 * author : Administrator
 * date : 2020/4/24 0024 14:04
 * description :
 */
public class StatusBar extends Toolbar {
    public StatusBar(Context context) {
        this(context, null);
    }

    public StatusBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StatusBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        setPadding(getPaddingLeft(), getPaddingTop() + getStatusBarHeight(), getPaddingRight(), getPaddingBottom());
    }

    /**
     * 获取状态栏高度
     */
    public int getStatusBarHeight() {
        Resources resources = getResources();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        return resources.getDimensionPixelSize(resourceId);
    }
}
