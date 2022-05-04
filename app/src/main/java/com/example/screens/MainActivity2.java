package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button homepage;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("==>", "MainActivity2 started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "MainActivity2 stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "MainActivity2 destroyed.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("==>", "MainActivity2 paused.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("==>", "MainActivity2 resumed.");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("==>", "Main Activity 2 created.");
        homepage = findViewById(R.id.home_button);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String username = extras.getString("username");
        Log.d("==>", "Username from intent" +username);

        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Go to home page pressed.");
                finish();
            }
        });

    }
}