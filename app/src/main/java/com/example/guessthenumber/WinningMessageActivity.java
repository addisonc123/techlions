package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WinningMessageActivity extends AppCompatActivity {
    TextView userScoreMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winning_message);

        userScoreMsg = (TextView) findViewById(R.id.userScoreMsg);
        if (GuessEntryActivity.score == 1) {
            userScoreMsg.setText(String.format("You have made %d right guess", GuessEntryActivity.score));
        } else {
            userScoreMsg.setText(String.format("You have made %d right guesses", GuessEntryActivity.score));
        }

        Button b1=(Button)findViewById(R.id.buttonNext2);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent = new Intent(WinningMessageActivity.this, GuessEntryActivity.class);
                startActivity(myintent);
            }
        });
    }
}