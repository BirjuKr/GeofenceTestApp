package com.roam.geofencetestapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("geofence_id")
    @Expose
    private String geofenceId;
    @SerializedName("geometry_type")
    @Expose
    private String geometryType;
    @SerializedName("geometry_radius")
    @Expose
    private Integer geometryRadius;
    @SerializedName("geometry_center")
    @Expose
    private GeometryCenter geometryCenter;
    @SerializedName("is_enabled")
    @Expose
    private Boolean isEnabled;
    @SerializedName("is_deleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public String getGeofenceId() {
        return geofenceId;
    }

    public void setGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
    }

    public String getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(String geometryType) {
        this.geometryType = geometryType;
    }

    public Integer getGeometryRadius() {
        return geometryRadius;
    }

    public void setGeometryRadius(Integer geometryRadius) {
        this.geometryRadius = geometryRadius;
    }

    public GeometryCenter getGeometryCenter() {
        return geometryCenter;
    }

    public void setGeometryCenter(GeometryCenter geometryCenter) {
        this.geometryCenter = geometryCenter;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
