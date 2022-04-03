package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GuessEntryActivity extends AppCompatActivity {

    private EditText userGuess;
    private String userGuessString;
    private int userEntry;
    public static int appGuess;
    public static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_entry);

        if (DifficultyLevelActivity.difficultyLevel == "Medium"){
            appGuess = (int) Math.floor(Math.random() * 4);
        } else {
            appGuess = (int) Math.floor(Math.random() * 6);
        }

        Button b1=(Button)findViewById(R.id.buttonEntry);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                userGuess = (EditText) findViewById(R.id.userGuess);
                userGuessString = userGuess.getText().toString();
                userEntry = new Integer(userGuessString).intValue();
                if (userEntry == appGuess){
                    score += 1;
                    Intent myintent = new Intent(GuessEntryActivity.this, CorrectGuessActivity.class);
                    startActivity(myintent);
                } else if (userEntry != appGuess){
                    score = 0;
                    Intent myintent = new Intent(GuessEntryActivity.this, WrongGuessActivity.class);
                    startActivity(myintent);
                }
            }
        });
    }
}