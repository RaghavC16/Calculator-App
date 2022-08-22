package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchScreens(View v){
        // get a reference to the EditText element in the xml page that is connected to this activity.
        // to this activity
        EditText editText1 = findViewById(R.id.firstNum);
        EditText editText2 = findViewById(R.id.secondNum);
        // extract the text
        String input1 = editText1.getText().toString();
        String input2 = editText2.getText().toString();



        /*
        Create an intent (envelope) by telling Android who the sender and receiver is
        then we need to fill teh intent and lastly we need to start the intent.
         */

        Intent intent = new Intent(this, AnswerScreen.class);
        // first param is the sender of the intent, which is this Activity
        // second param is the receiver, which is SecondActivity

        // we need to label everything we put into the intent so that it can be extracted
        // when the intent is opened in the other activity


        // I learned how to use switch case to switch the screen to the answer. To do this, I also had to learn how to use the parseDouble() function to
        // take the string input and change it into a double for the calculations.
        double answer = 0;
        switch(v.getId()){
            //not first num make it button :)
            case R.id.addButton:
                answer = Double.parseDouble(input1) + Double.parseDouble(input2);
                break;
            case R.id.subtractButton:
                answer = Double.parseDouble(input1) - Double.parseDouble(input2);
                break;
            case R.id.multiplyButton:
                answer = Double.parseDouble(input1) * Double.parseDouble(input2);
                break;
            case R.id.divideButton:
                answer = Double.parseDouble(input1) / Double.parseDouble(input2);
                break;


        }

        // I learned how to use the Double.toString to change the double answer into a string to display on the second screen.
        String stringAnswer = Double.toString(answer);
        intent.putExtra("Answer", stringAnswer);
        // launches the new screen and passes the information
        startActivity(intent);

    }







}
