package com.example.svega.iguitarapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ChordsActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chords);
    }

    // Öppnar main_activity (huvudmenyn) samma för alla undersidor
    public void openHome (View view){
        Intent secondActivity = new Intent(ChordsActivity.this, MainActivity.class);
        startActivity(secondActivity);
    }

    public void openSongActivity(View view) {
        Intent secondActivity = new Intent(ChordsActivity.this, SongActivity.class);
        startActivity(secondActivity);
    }

    // Spelar upp det valda ackordet vid knapptryck och stannar uppspelandet när ljudklippet är slut (https://www.youtube.com/watch?v=C_Ka7cKwXW0, 2018)
    public void playA(View view){

        player = MediaPlayer.create(this, R.raw.a_ackord);
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayer();
            }
        });
    }

    public void playC(View view){

        player = MediaPlayer.create(this, R.raw.c_ackord);
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayer();
            }
        });
    }

    public void playD(View view){
        player = MediaPlayer.create(this, R.raw.d_ackord);
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayer();
            }
        });
    }

    public void playG(View view){
        player = MediaPlayer.create(this, R.raw.g_ackord);
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlayer();
            }
        });
    }

    // Stoppar mediaplayern vid knapptryck och visar en "toast" när det stoppas (https://www.youtube.com/watch?v=C_Ka7cKwXW0, 2018)
    public void stop(View view){
        stopPlayer();
    }

    private void stopPlayer(){
        if (player != null){
            player.release();
            player = null;
            Toast.makeText(this,"Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    protected void onStop(){
        super.onStop();
        stopPlayer();
    }
}