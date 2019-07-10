
package com.example.contacturbanghats;

import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("status")
    private String status;
    @SerializedName("message")
    private String message;
    @SerializedName("location_list")
    private LocationList locationList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocationList getLocationList() {
        return locationList;
    }

    public void setLocationList(LocationList locationList) {
        this.locationList = locationList;
    }
}
