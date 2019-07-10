package com.example.contacturbanghats;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("contactus")
    Call<Contact> contact();
}
