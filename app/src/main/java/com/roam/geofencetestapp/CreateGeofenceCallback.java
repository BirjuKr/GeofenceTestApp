package com.roam.geofencetestapp;

import com.roam.geofencetestapp.model.GeofenceResponse;

public interface CreateGeofenceCallback {

    void onSuccess(GeofenceResponse geofenceResponse);

    void onError(GeofenceResponse geofenceResponse);
}
