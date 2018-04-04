package com.example.daniel.findantonymsynonym2;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class getAnt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_ant);
        final String word = getIntent().getExtras().getString("wordToFind");
        final TextView textView = findViewById(R.id.Output);
        new AsyncTask<Context, Void, Void>() {
            @Override
            protected Void doInBackground(Context... voids) {
                Antonym antonym = AppDatabase.buildAppDatabase(voids[0]).userDao().fetchAntonym(word);
                textView.setText(antonym == null ? "Could not find antonym" : antonym.getAntonym());
                return null;
            }
        }.execute(this);
    }


}
