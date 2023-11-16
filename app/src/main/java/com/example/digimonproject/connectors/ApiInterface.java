package com.example.digimonproject.connectors;


import com.example.digimonproject.DigimonModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {
    @GET("digimon")
    Call<List<DigimonModel>> getDigimon();
}
