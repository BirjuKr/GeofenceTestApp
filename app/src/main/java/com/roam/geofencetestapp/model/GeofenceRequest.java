package com.roam.geofencetestapp.model;

public class GeofenceRequest {
    private String geometry_type;
    private Boolean is_enabled;
    private String tag;
    private String description;
    private double geometry_radius;
    private double[] coordinates;

    public void setGeometry_type(String geometry_type) {
        this.geometry_type = geometry_type;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public void setGeometry_radius(double geometry_radius) {
        this.geometry_radius = geometry_radius;
    }

    public void setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
