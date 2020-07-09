package com.example.svega.iguitarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class PartsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts);
    }
    public void openPartTest(View view) {
        Intent secondActivity = new Intent(PartsActivity.this, PartTestActivity.class);
        startActivity(secondActivity);
    }
        public void openHome (View view){
        Intent secondActivity = new Intent(PartsActivity.this, MainActivity.class);
        startActivity(secondActivity);
    }
}
