package com.example.daniel.findantonymsynonym2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Daniel on 3/20/18.
 */

public class DatabaseHelper/* extends SQLiteOpenHelper*/ {
/*
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "antonyms.db";
    private static final String COLUMN_ID="id";
    private static final String TABLE_NAME = "antonyms";
    private static final String COLUMN_ANTONYM = "antonym";
    private static final String COLUMN_WORD = "word";
    SQLiteDatabase db;
   private static final String TABLE_CREATE = "create table antonyms (id integer primary key not null auto_increment," +
            "antonym text not null, word text not null);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);


    }
    public boolean inserWord(String word, String antonym) {
        db = this.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_WORD, word);
        values.put(COLUMN_ANTONYM, antonym);
        db.insert(TABLE_NAME, null, values);
    }
        //public Cursor getAllData(){
    }


//    public void insertAntonym(Antonym a) {
//        db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put(COLUMN_ANTONYM, a.getAntonym());
//        values.put(COLUMN_WORD, a.getWord());
//
//        db.insert(TABLE_NAME, null, values);
//
//    }

    public String searchAntonym(String word) {
        db = this.getReadableDatabase();
        String query = "Select word, antonym from" + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String a;
        String b = "Not found";
        if(cursor.moveToFirst()){
            do{
                a= cursor.getString(0);

                if(a.equals(word)){
                    b=cursor.getString(1);
                    break;
                }
            } while(cursor.moveToNext());
        }
        return b;*/
    }



