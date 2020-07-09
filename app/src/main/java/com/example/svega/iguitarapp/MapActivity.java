package com.example.svega.iguitarapp;

import android.Manifest;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.location.LocationManager;
import android.content.Context;
import android.location.Location;
import android.location.Geocoder;
import android.location.Address;


public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // Funkar ej? Hade problem med kartan kunde inte lista ut hur det fungerade
       //mLocationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        //mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 500, 1, this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Lägger till en "Marker" vid Lidköpingsmusikaffär och Trollhättans musikaffär.
        LatLng lidkopingMusik = new LatLng(58.50397575, 13.16177753);
        mMap.addMarker(new MarkerOptions().position(lidkopingMusik).title("Lidköping"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lidkopingMusik));

        LatLng trollhattan = new LatLng(58.2863039, 12.2880323);
        mMap.addMarker(new MarkerOptions().position(trollhattan).title("Trollhättan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(trollhattan, 8));

    }

    public void openHome (View view){
        Intent secondActivity = new Intent(MapActivity.this, MainActivity.class);
        startActivity(secondActivity);
    }
}