package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_screen);

        Intent intent = getIntent();
        String answertoShow  = intent.getStringExtra("Answer");

        TextView textView = findViewById(R.id.finalAnswer);
        textView.setText(answertoShow);

    }
}