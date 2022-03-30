package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WrongGuessActivity extends AppCompatActivity {

    TextView correctGuessMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_guess);

        correctGuessMsg = (TextView) findViewById(R.id.correctGuessMsg);
        correctGuessMsg.setText(String.format("The number I was thinking of is: %d", GuessEntryActivity.appGuess));


        Button b1=(Button)findViewById(R.id.buttonNext);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(GuessEntryActivity.score == 0){
                    Intent myintent = new Intent(WrongGuessActivity.this, LeaderboardActivity.class);
                    startActivity(myintent);
                } else {
                    Intent myintent2 = new Intent(WrongGuessActivity.this, WinningMessageActivity.class);
                    startActivity(myintent2);
                }
            }
        });
    }
}