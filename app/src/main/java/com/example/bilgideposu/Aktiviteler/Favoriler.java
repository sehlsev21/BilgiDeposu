package com.example.bilgideposu.Aktiviteler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.bilgideposu.R;

public class Favoriler extends AppCompatActivity {

    private Button buttonFavFilm,buttonFavUlke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoriler);

        buttonFavFilm = findViewById(R.id.buttonFavFilm);
        buttonFavUlke = findViewById(R.id.buttonFavUlke);

        //Bayrak sınavına gider
        buttonFavFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Favoriler.this,"Favoriler sistemi yakında gelecektir!", Toast.LENGTH_SHORT).show();
            }
        });
        //Bayrak sınavına gider
        buttonFavUlke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Favoriler.this,"Favoriler sistemi yakında gelecektir!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}