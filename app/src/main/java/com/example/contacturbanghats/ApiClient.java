package com.example.contacturbanghats;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// Java program implementing Singleton class
// with getInstance() method
public class ApiClient {

    public static final String BASE_URL = "http://urbanghats.com/urbanghat_user_services/api/";


    /*public static Retrofit getInstance() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }*/

    public static ApiService getAPICall() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);
        return  service;
    }

}
