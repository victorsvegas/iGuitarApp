package com.example.svega.iguitarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TheoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
    }
    public void openHome (View view){
        Intent secondActivity = new Intent(TheoryActivity.this, MainActivity.class);
        startActivity(secondActivity);
    }
}
