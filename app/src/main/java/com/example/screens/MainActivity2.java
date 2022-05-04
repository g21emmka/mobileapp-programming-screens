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
        Log.d("==>", "ProfileAcitivty started.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("==>", "ProfileAcitivty stopped.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("==>", "ProfileAcitivty destroyed.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("==>", "ProfileAcitivty paused.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("==>", "ProfileAcitivty resumed.");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("==>", "ProfileAcitivty created.");
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