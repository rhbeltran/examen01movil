package com.example.digimonproject.connectors;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    public static RetrofitInstance instance;
    private ApiInterface apiInterface;

    RetrofitInstance() {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://digimon-api.vercel.app/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiInterface = retrofit.create(ApiInterface.class);
    }

    public static RetrofitInstance getInstance() {
        if (instance == null) {
            instance = new RetrofitInstance();
        }
        return instance;
    }

    public ApiInterface getApiInterface() {
        return apiInterface;
    }
}

