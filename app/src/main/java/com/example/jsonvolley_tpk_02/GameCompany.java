package com.example.jsonvolley_tpk_02;

import com.google.gson.annotations.SerializedName;

public class GameCompany {

    @SerializedName("name")
    public String gameCompanyName;

    @SerializedName("year")
    public int getGameYearFounded;

    @SerializedName("recentGame")
    public String gameCompanyLatestGame;

    public GameCompany(String name, int year, String game){
        gameCompanyName = name;
        getGameYearFounded = year;
        gameCompanyLatestGame = game;
    }
}