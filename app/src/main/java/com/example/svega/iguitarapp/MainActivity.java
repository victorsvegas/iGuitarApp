package com.example.svega.iguitarapp;

import android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Öppnar de olika sidorna vid knapptryck, samma kod för alla knappar!
    public void openParts(View view) {
        Intent secondActivity = new Intent(MainActivity.this, PartsActivity.class);
        startActivity(secondActivity);
    }
    public void openChords(View view) {
        Intent secondActivity = new Intent(MainActivity.this, ChordsActivity.class);
        startActivity(secondActivity);
    }
    public void openTheory(View view) {
        Intent secondActivity = new Intent(MainActivity.this, TheoryActivity.class);
        startActivity(secondActivity);
    }
    public void openMap(View view) {
        Intent secondActivity = new Intent(MainActivity.this, MapActivity.class);
        startActivity(secondActivity);
    }
}
