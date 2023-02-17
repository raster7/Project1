package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myLogs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showInfo("onCreate");
        Log.i(TAG, "onCreate");
    }

    public void showInfo(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        showInfo("onStart");
        Log.w(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showInfo("onResume");
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showInfo("onPause");
        Log.v(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}