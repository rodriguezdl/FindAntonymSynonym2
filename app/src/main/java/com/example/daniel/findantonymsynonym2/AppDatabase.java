package com.example.daniel.findantonymsynonym2;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by Daniel on 4/1/18.
 */
@Database(entities = {Antonym.class}, version =1)
public abstract class AppDatabase extends RoomDatabase {
    public static AppDatabase buildAppDatabase(Context c) {
        return Room.databaseBuilder(c, AppDatabase.class, "antonyms").build();
    }
    public abstract AntonymDao userDao();
}
