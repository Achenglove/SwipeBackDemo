package com.ccr.swipe.view;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

/**
 * @Created on 2018/9/11.
 * @autthor Acheng
 * @Email 345887272@qq.com
 * @Description
 */

public class SwipeBackHelper {

    private Activity mActivity;

    private SwipeBackLayout mSwipeBackLayout;

    public SwipeBackHelper(Activity activity) {
        mActivity = activity;
    }

    public void onCreate() {
        mActivity.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mActivity.getWindow().getDecorView().setBackgroundColor(Color.TRANSPARENT);
        mSwipeBackLayout = new SwipeBackLayout(mActivity);
    }

    public void onPostCreate() {
        mSwipeBackLayout.attachToActivity(mActivity);
    }

    public View findViewById(int id) {
        if (mSwipeBackLayout != null) {
            return mSwipeBackLayout.findViewById(id);
        }
        return null;
    }

    protected SwipeBackLayout getSwipeBackLayout() {
        return mSwipeBackLayout;
    }
}
