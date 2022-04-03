package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LeaderboardActivity extends AppCompatActivity {
    private TextView leaderboard;
    private TextView finalScore;
    private String scoreString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        TreeMap savedScores = new TreeMap();
        savedScores.put(GuessEntryActivity.score, HomepageActivity.usernameString);
        Set<Map.Entry<Integer, String>> savedScoresSet = savedScores.entrySet();
        Map.Entry<Integer, String>[] savedScoresArray = savedScoresSet.toArray(new Map.Entry[savedScoresSet.size()]);
        scoreString = String.format("%-30s\t%d", savedScoresArray[savedScoresArray.length - 1].getValue(), savedScoresArray[savedScoresArray.length - 1].getKey());
        for (int i = savedScoresArray.length - 2; i >= 0; i--) {
            scoreString += String.format("\n%-30s\t%d", savedScoresArray[i].getValue(), savedScoresArray[i].getKey());
        }

        leaderboard = (TextView) findViewById(R.id.textViewLeaderboard);
        leaderboard.setText(scoreString);

        finalScore = (TextView) findViewById(R.id.finalScore);
        finalScore.setText(String.format("%s's final score is %d", HomepageActivity.usernameString,GuessEntryActivity.score));

        Button b1 = (Button) findViewById(R.id.buttonPlayAgain);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myintent2 = new Intent(LeaderboardActivity.this, HomepageActivity.class);
                startActivity(myintent2);
            }
        });
    }
}