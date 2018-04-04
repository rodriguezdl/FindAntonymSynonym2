package com.example.daniel.findantonymsynonym2;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Daniel on 4/1/18.
 */
@Dao
public interface AntonymDao {
    @Query("SELECT * FROM antonym")
    List<Antonym> getAll();

    @Query("SELECT * FROM antonym WHERE word=(:word)")
    Antonym fetchAntonym(String word);

    @Insert
    void insertAll(Antonym... antonyms);

    @Delete
    void delete(Antonym antonym);




}
