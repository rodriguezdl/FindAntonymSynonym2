package com.example.daniel.findantonymsynonym2;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    private AppDatabase AntDb;
    private Button button;
    private Button button2;
    private EditText word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        word = findViewById(R.id.editText3);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        final Button findAntonymButton = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(word.getText().toString());


            }

        });

        findAntonymButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), getAnt.class);
                intent.putExtra("wordToFind", word.getText().toString());
                startActivity(intent);
            }
        });

//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), Display.class);
//                startActivity(intent);
//            }
//        });


    }




    private void next(String text) {
        Intent intent = new Intent(getApplicationContext(), Display.class);
        intent.putExtra("word",word.getText().toString());
        startActivity(intent);
    }

}
