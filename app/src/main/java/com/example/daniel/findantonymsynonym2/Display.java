package com.example.daniel.findantonymsynonym2;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.icu.text.IDNA.Info;

import android.widget.Toast;
import android.content.Intent;
import android.support.design.widget.Snackbar;


/**
 * Created by Daniel on 3/16/18.
 */

public class Display extends AppCompatActivity {

//     DatabaseHelper helper= new DatabaseHelper(this);



    private EditText word;
    private Button button2;
    AntonymDao db;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String str= getIntent().getExtras().getString("text");
        db= AppDatabase.buildAppDatabase(getApplicationContext()).userDao();
        word=findViewById(R.id.editText);
        button2=findViewById(R.id.button2);
        word.setText(str);


        button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {

                new AsyncTask<Void, Void, Void>() {
                    @Override
                    protected Void doInBackground(Void[] objects) {
                        db.insertAll(new Antonym(){{
                            setWord(word.getText().toString());
                            setAntonym(((EditText) findViewById(R.id.editText2)).getText().toString());
                        }});
                        return null;
                    }
                    protected void onPostExecute (Void voids){
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    }

                }.execute();





                Snackbar.make(view,"Words have been added to database",Snackbar.LENGTH_LONG);


                InputMethodManager inputManager=(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);

            }});

    }



}
