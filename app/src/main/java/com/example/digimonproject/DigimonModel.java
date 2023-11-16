package com.example.digimonproject;

import com.google.gson.annotations.SerializedName;

public class DigimonModel {
    private String name;
    private int id;

    @SerializedName("img")
    private  String digImg;


    @SerializedName("level")
    private String level;



    public DigimonModel(String name, int id, String digImg, String level) {
        this.name = name;
        this.id = id;
        this.digImg = digImg;
        this.level = level;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDigImg() {
        return digImg;
    }

    public String getRankLevel() {
        return level;
    }

}


