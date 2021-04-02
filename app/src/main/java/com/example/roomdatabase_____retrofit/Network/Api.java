package com.example.roomdatabase_____retrofit.Network;

import com.example.roomdatabase_____retrofit.Model.Actor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("data.php")
    Call<List<Actor>> getAllActors();
}
