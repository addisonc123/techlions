package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CorrectGuessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct_guess);

        Button b1=(Button)findViewById(R.id.buttonNextRound);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent = new Intent(CorrectGuessActivity.this, WinningMessageActivity.class);
                startActivity(myintent);

            }
        });

        Button b2=(Button)findViewById(R.id.buttonEndGame);
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent = new Intent(CorrectGuessActivity.this, LeaderboardActivity.class);
                startActivity(myintent);
            }
        });
    }
}