package com.example.hw3_1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class ThirdActivity extends AppCompatActivity {

    AppCompatButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        findViewById();
        clickListener();
    }

    private void findViewById() {
        button = findViewById(R.id.Button_Third);
    }

    private void clickListener() {
        button.setOnClickListener(view -> {
            transition();
        });
    }

    private void transition() {
        Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
