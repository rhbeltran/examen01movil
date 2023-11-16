package com.example.digimonproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.digimonproject.connectors.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvMain;
    private List<DigimonModel> digimon;

    public static String apiURL = "https://digimon-api.vercel.app/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvMain = findViewById(R.id.rcvMain);
        rcvMain.setLayoutManager(new LinearLayoutManager(this));
        RetrofitInstance.getInstance().getApiInterface().getDigimon().enqueue(new Callback<List<DigimonModel>>() {
            @Override
            public void onResponse(Call<List<DigimonModel>> call, Response<List<DigimonModel>> response) {
                digimon = response.body();
                rcvMain.setAdapter(new DigimonAdapter(getApplicationContext(), digimon));
            }

            @Override
            public void onFailure(Call<List<DigimonModel>> call, Throwable t) {
                Log.e("api", "onfile lure: " + t.getLocalizedMessage());
            }
        });
    }
}