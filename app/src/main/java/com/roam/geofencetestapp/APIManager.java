package com.roam.geofencetestapp;

import static com.roam.geofencetestapp.APIFactory.API_KEY;

import android.content.Context;
import android.util.Log;

import com.roam.geofencetestapp.model.GeofenceRequest;
import com.roam.geofencetestapp.model.GeofenceResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class APIManager {
    public static void createGeofence(Context context, GeofenceRequest request, CreateGeofenceCallback createGeofenceCallback) {
        try {
            Call<GeofenceResponse> call = APIFactory.build().createGeofence(API_KEY,
                    request);
            call.enqueue(new Callback<GeofenceResponse>() {
                @Override
                public void onResponse(Call<GeofenceResponse> call, Response<GeofenceResponse> response) {
                    try {
                        GeofenceResponse geofenceResponse = response.body();
                        Log.e("TAG", "onResponse: "+geofenceResponse.getCode() );
                        if(response.code()==201){
                            createGeofenceCallback.onSuccess(geofenceResponse);
                        } else if (response.code()==400) {
                            createGeofenceCallback.onError(geofenceResponse);
                        } else {
                            createGeofenceCallback.onError(null);
                        }
                    } catch (Exception e) {
                        createGeofenceCallback.onError(null);
                    }
                }

                @Override
                public void onFailure(Call<GeofenceResponse> call, Throwable t) {
                    createGeofenceCallback.onError(null);
                }
            });
        } catch (Exception e) {
            createGeofenceCallback.onError(null);
        }
    }

}
