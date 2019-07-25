package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test00" , "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test00" , "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("test00" , "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test00" , "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("test00" , "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("test00" , "onDestroy");
    }
}
