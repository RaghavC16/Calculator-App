package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Integral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integral);

        Intent intent = getIntent();

    }



    public void switchScreensSolution(View v) {
        // get references to the EditText elements in the xml page that is connected to this activity.
        // to this activity
        EditText editText1 = findViewById(R.id.cof1);
        EditText editText2 = findViewById(R.id.cof2);
        EditText editText3 = findViewById(R.id.cof3);
        EditText editText4 = findViewById(R.id.constant);
        // extract the texts
        String input1 = editText1.getText().toString();
        String input2 = editText2.getText().toString();
        String input3 = editText3.getText().toString();
        String input4 = editText4.getText().toString();




        /*
        Create an intent (envelope) by telling Android who the sender and receiver is
        then we need to fill teh intent and lastly we need to start the intent.
         */

        Intent intent = new Intent(this, IntegralSolutionScreen.class);
        // first param is the sender of the intent, which is this Activity
        // second param is the receiver, which is IntegralSolutionScreen

        // we need to label everything we put into the intent so that it can be extracted
        // when the intent is opened in the other activity


        // I learned how to use switch case to switch the screen to the answer. To do this, I also had to learn how to use the parseDouble() function to
        // take the string input and change it into a double for the calculations.

        String newCof1 = Double.toString(Double.parseDouble(input1) / 4);
        String newCof2 = Double.toString(Double.parseDouble(input2) / 3);
        String newCof3 = Double.toString(Double.parseDouble(input3) / 2);
        String newCof4 = Double.toString(Double.parseDouble(input4) / 1);

        String finalAnswer = newCof1 + "x^4 + " + newCof2 + "x^3 + " + newCof3 + "x^2 + " + newCof4 + "x + C";

        intent.putExtra("AnswerIntegral", finalAnswer);
        // launches the new screen and passes the information
        startActivity(intent);

    }







}