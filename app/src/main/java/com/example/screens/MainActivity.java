package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button profile;
    private EditText username;


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

        username = findViewById(R.id.username);

        profile = findViewById(R.id.profile_button);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Go to profile page button pressed.");
                Log.d("==>", "Username:"+username.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("username", username.getText().toString());
                startActivity(intent);

            }
        });
    }
}
