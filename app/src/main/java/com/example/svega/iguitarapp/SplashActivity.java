package com.example.svega.iguitarapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    // berättar hur länge sidan skall visas innan den går över till main_activity (https://www.youtube.com/watch?v=jXtof6OUtcE, 2016)
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Fördröjer att appen skall bytas med vald tid åvanför och startar sedan main_activity istället
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
            },SPLASH_TIME_OUT);
        }
    }
