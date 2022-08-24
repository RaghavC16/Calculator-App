package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IntegralSolutionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integral_solution_screen);

        Intent intent = getIntent();
        String answertoShow  = intent.getStringExtra("AnswerIntegral");

        TextView textView = findViewById(R.id.finalAnswerIntegrate);
        textView.setText(answertoShow);

    }
}