package com.example.svega.iguitarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.Toast;

public class PartTestActivity extends AppCompatActivity {

// Initierar arrayen med alla gitarrens delar och variabeln i som används i spinnern
    String[] partsArray = new String[16];
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_test);

        // Här skapas arrayen och spinnern laddas in
        partsArray[0] = "Headstock";
        partsArray[1] = "Neck";
        partsArray[2] = "Fretboard";
        partsArray[3] = "Body";
        partsArray[4] = "Machine Heads";
        partsArray[5] = "Nut";
        partsArray[6] = "Frets";
        partsArray[7] = "Heel";
        partsArray[8] = "Bottom deck";
        partsArray[9] = "Sound hole";
        partsArray[10] = "Strings";
        partsArray[11] = "Body Sides";
        partsArray[12] = "Saddle";
        partsArray[13] = "Bridge";
        partsArray[14] = "Soundboard";
        LoadSpinner();
    }

    public void openHome (View view){
        Intent secondActivity = new Intent(PartTestActivity.this, MainActivity.class);
        startActivity(secondActivity);
    }

    // Här skapas spinnern med gitarrens olika delar och lagras i en array (Jan-Olof, 2017)
    private void LoadSpinner(){
        Spinner spin = (Spinner) findViewById(R.id.spinnerParts);
        String[] parts = { "Machine heads", "Soundboard", "Nut", "Headstock", "Neck", "Saddle", "Fretboard", "Body Sides","Body", "Frets", "Bridge","Heel", "Bottom deck", "Sound hole", "Strings"};

        ArrayAdapter<String> aa = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, parts);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    // Här kollar programet vad spinnern har för värde och jämför det med rätt svar
    public void onClickSelected(View view) {

        Spinner spin = (Spinner) findViewById(R.id.spinnerParts);
        String check;
        check = spin.getSelectedItem().toString();

        // om spinnerns värde stämmer överrens med gitarrens del kommer en toast med att rätt svar att visas
        if (check.equalsIgnoreCase(partsArray[i])) {
                    String val1 = "That's the right answer!";
                    Toast.makeText(this, val1, Toast.LENGTH_LONG).show();
                    // värdet "i" ökar efter varje rätt svar för att gå vidare till nästa del
                    i++;

                    // Denna toast visas när alla delar är rätt nämnda
                    if (i == 15){
                    Toast.makeText(this,"Congratulations! you named all of the parts!", Toast.LENGTH_LONG).show();
                    }

                    // Denna toast visas efter varje rätt svar, för att påminna användaren om vilken del hen är på
                    else {
                    Toast.makeText(this,"What´s the name of part: " + (i + 1) + "?", Toast.LENGTH_LONG).show();
                }
                }

                // Visas vi fel svar
                else {
                    String val = "That's NOT the right answer! Try again!";
                    Toast.makeText(this, val, Toast.LENGTH_LONG).show();
                    Toast.makeText(this,"What´s the name of part: " + (i + 1) + "?", Toast.LENGTH_LONG).show();
                }
    }
}
