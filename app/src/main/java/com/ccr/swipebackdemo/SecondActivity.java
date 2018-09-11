package com.ccr.swipebackdemo;

import android.util.Log;

/**
 * @Created on 2018/9/11.
 * @autthor Acheng
 * @Email 345887272@qq.com
 * @Description
 */

public class SecondActivity extends BaseActivity {

    @Override
    protected void initUI() {

    }

    @Override
    protected int getLayoutId() {
        Log.d("Acheng","========2onCreate()========");
        return R.layout.second_main;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Acheng","========2onStart()========");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Acheng","========2onResume()========");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Acheng","========2onPause()========");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Acheng","========2onStop()========");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Acheng","========2onDestroy()========");
    }
}
