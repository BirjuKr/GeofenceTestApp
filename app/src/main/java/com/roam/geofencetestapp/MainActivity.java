package com.roam.geofencetestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.roam.geofencetestapp.model.GeofenceRequest;
import com.roam.geofencetestapp.model.GeofenceResponse;

public class MainActivity extends AppCompatActivity {


    private Button btCreateGeofence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCreateGeofence=findViewById(R.id.btCreateGeofence);

        btCreateGeofence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createGeofence();
            }
        });
    }

    private void createGeofence() {

        double [] coordinates={-72.28122, 42.926042};

        GeofenceRequest geofence=new GeofenceRequest();
        geofence.setCoordinates(coordinates);
        geofence.setGeometry_type("circle");
        geofence.setGeometry_radius(130);
        geofence.setDescription("Delhi");
        geofence.setTag("tag1");
        geofence.setIs_enabled(true);

        try {
            APIManager.createGeofence(this, geofence, new CreateGeofenceCallback() {
                @Override
                public void onSuccess(GeofenceResponse geofenceResponse) {
                    Log.e("TAG", "onSuccess: "+new Gson().toJson(geofenceResponse));

                }

                @Override
                public void onError(GeofenceResponse geofenceResponse) {
                    Log.e("TAG", "onSuccess: "+new Gson().toJson(geofenceResponse));

                }
            });

        } catch (Exception e) {

        }
    }

}