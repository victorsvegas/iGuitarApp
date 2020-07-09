package com.example.svega.iguitarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
    }

    public void openHome (View view){
        Intent secondActivity = new Intent(SongActivity.this, MainActivity.class);
        startActivity(secondActivity);
    }
}
