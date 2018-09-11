package com.ccr.swipebackdemo;

import android.app.Application;

import com.ccr.swipe.util.ActivityStack;

/**
 * @Created on 2018/9/11.
 * @autthor Acheng
 * @Email 345887272@qq.com
 * @Description
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        this.registerActivityLifecycleCallbacks(ActivityStack.getInstance());
    }
}
