
package com.example.contacturbanghats;

import com.google.gson.annotations.SerializedName;

public class LocationList {

    @SerializedName("id")
    private int id;
    @SerializedName("mobile_no")
    private String mobileNo;
    @SerializedName("address")
    private String address;
    @SerializedName("email")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
