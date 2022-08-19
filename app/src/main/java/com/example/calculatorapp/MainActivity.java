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

        double answer;
        switch(v.getId()){
            //not first num make it button :)
            case R.id.addButton:
                answer = Double.parseDouble(input1) + Double.parseDouble(input2);
                break;
            case R.id.subtractButton:

        }
        intent.putExtra("Answer", answer);
        // launches the new screen and passes the information
        startActivity(intent);

    }







}
