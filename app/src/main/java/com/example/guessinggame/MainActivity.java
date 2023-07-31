package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button checkButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = findViewById(R.id.editTextId);
        checkButton = findViewById(R.id.checkButtonId);
        resultTextView = findViewById(R.id.resultTextId);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String guessString = editText.getText().toString();

                if (guessString.isEmpty()) {
                    errorMessage();
                }
                else {


                    int intGuess = Integer.parseInt(guessString);

                    if (intGuess>5){

                        errorMessage();
                    }

                    //Generating Random Number

                    Random random = new Random();
                    int randomNumber = random.nextInt(6);


                    if (randomNumber==intGuess){

                        resultTextView.setText("Congrats !!! You Have Won");
                        resultTextView.setTextColor(Color.GREEN);
                    }
                    else {
                        resultTextView.setText("Sorry ! You Have Lost. Random Number is "+randomNumber);
                        resultTextView.setTextColor(Color.RED);
                    }
                }
            }
        });
    }
    void errorMessage(){

        editText.setError("Please Enter a Number");
        editText.requestFocus();
        return;
    }
}