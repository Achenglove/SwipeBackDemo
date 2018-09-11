package com.ccr.swipebackdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ccr.swipe.view.SwipeBackActivity;

/**
 * @Created on 2018/9/11.
 * @autthor Acheng
 * @Email 345887272@qq.com
 * @Description
 */

public abstract class BaseActivity extends SwipeBackActivity {
    public Activity mActivity;
    public Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mActivity=this;
        initUI();
    }

    protected abstract void initUI();

    protected abstract int getLayoutId();
}
