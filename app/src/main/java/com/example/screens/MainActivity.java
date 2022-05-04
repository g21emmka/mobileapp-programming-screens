package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "MainAcitivty started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "MainAcitivty stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "MainAcitivty destroyed.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("==>", "MainAcitivty paused.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("==>", "MainAcitivty resumed.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("==>", "MainAcitivty created.");
    }
}
