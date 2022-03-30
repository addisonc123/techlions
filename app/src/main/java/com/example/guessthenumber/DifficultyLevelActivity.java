package com.example.guessthenumber;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DifficultyLevelActivity extends AppCompatActivity {
    public static String difficultyLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_level);

        Button b1=(Button)findViewById(R.id.difficultyMedium);
        Button b2=(Button)findViewById(R.id.difficultyAdvanced);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                difficultyLevel = "Medium";
                Intent myintent2 = new Intent(DifficultyLevelActivity.this, GuessEntryActivity.class);
                startActivity(myintent2);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                difficultyLevel = "Advanced";
                Intent myintent2 = new Intent(DifficultyLevelActivity.this, GuessEntryActivity.class);
                startActivity(myintent2);

            }
        });
    }
}