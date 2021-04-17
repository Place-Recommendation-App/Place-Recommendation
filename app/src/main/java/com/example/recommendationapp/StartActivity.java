package com.example.recommendationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button signup;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        signup = findViewById(R.id.signup);
        login = findViewById(R.id.login);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSignupPage();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openLoginPage();
            }
        });
    }

    public void openSignupPage(){

        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

    public void openLoginPage(){

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}