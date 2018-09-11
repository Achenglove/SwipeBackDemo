package com.ccr.swipebackdemo;

import android.content.Intent;
import android.util.Log;
import android.view.View;

public class MainActivity extends BaseActivity {
    @Override
    protected void initUI() {
        setSwipeBackEnable(false);
        findViewById(R.id.go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(mActivity,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected int getLayoutId() {
        Log.d("Acheng","========1onCreate()========");
        return R.layout.activity_main;
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Acheng","========1onStart()========");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Acheng","========1onResume()========");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Acheng","========1onPause()========");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Acheng","========1onStop()========");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Acheng","========1onDestroy()========");
    }
}
