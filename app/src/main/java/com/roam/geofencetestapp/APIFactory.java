package com.roam.geofencetestapp;

public class APIFactory {
    //URL
    private static final String HOST = "https://api.roam.ai/v1/api/";
    static final String GEOFENCE = "geofence/";
    //Header
    final static String API_KEY = "your api key";

    public static APIInterface build() {
        return RetrofitClient.getClient(HOST).create(APIInterface.class);
    }
}
