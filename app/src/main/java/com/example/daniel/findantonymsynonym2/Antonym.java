package com.example.daniel.findantonymsynonym2;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by Daniel on 3/20/18.
 */
@Entity(primaryKeys = {"word", "antonym"})
public class Antonym {




  @NonNull
    private String word = "";
  @NonNull
    private String antonym = "";

  public void setWord(String word){
    this.word=word;
  }
  public void setAntonym(String antonym){
    this.antonym=antonym;
  }

  public String getWord(){
    return word;
  }

  public String getAntonym(){
    return this.antonym;
  }

}
