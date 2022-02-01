package com.roam.geofencetestapp;

import com.roam.geofencetestapp.model.GeofenceRequest;
import com.roam.geofencetestapp.model.GeofenceResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIInterface {
    @Headers("Content-Type: application/json")
    @POST(APIFactory.GEOFENCE)
    Call<GeofenceResponse> createGeofence(@Header("API-KEY") String  apiKey,
                                          @Body GeofenceRequest createGeofenceAPI);
}
