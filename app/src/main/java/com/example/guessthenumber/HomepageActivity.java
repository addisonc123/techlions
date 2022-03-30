package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomepageActivity extends AppCompatActivity {

    public static EditText username;
    public static String usernameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button b1=(Button)findViewById(R.id.buttonStart);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                username = findViewById(R.id.username);
                usernameString = username.getText().toString();
                Intent myintent = new Intent(HomepageActivity.this, DifficultyLevelActivity.class);
                startActivity(myintent);

            }
        });
    }
}
//test