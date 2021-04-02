package com.example.roomdatabase_____retrofit.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.roomdatabase_____retrofit.Model.Actor;

import java.util.List;

public interface ActorDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<Actor> actorList);

    @Query("SELECT * FROM actor")
    LiveData<List<Actor>> getAllActors();

    @Query("DELETE FROM actor")
    void deleteAll();
}
