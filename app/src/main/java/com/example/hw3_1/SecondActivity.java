package com.example.hw3_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class SecondActivity extends AppCompatActivity {

    AppCompatButton button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_second);
        findViewById();
        setText();
        clickListener();
    }

    private void findViewById() {
        button = findViewById(R.id.Button_Second);
        textView = findViewById(R.id.Text_View);
    }

    private void clickListener() {
        button.setOnClickListener(view -> {
            transition();
        });
    }

    private void setText() {
        String nameFromActivity = getIntent().getStringExtra("name");
        textView.setText("Hello " + nameFromActivity);
    }

    private void transition() {
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }
}
