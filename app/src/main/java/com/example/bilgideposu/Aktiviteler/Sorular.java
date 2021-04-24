package com.example.bilgideposu.Aktiviteler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.bilgideposu.R;

public class Sorular extends AppCompatActivity {

    private Button buttonBayrakSorular,buttonBaşkentSorular,buttonFilmSorular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorular);

        buttonBayrakSorular = findViewById(R.id.buttonBayrakSorular);
        buttonBaşkentSorular = findViewById(R.id.buttonBaşkentSorular);
        buttonFilmSorular = findViewById(R.id.buttonFilmSorular);

        //Bayrak sınavına gider
        buttonBayrakSorular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorular.this,"Sınavlar yakında güncellenecektir !", Toast.LENGTH_SHORT).show();
            }
        });

        //Başkent sınavına gider
        buttonBaşkentSorular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorular.this,"Sınavlar yakında güncellenecektir !", Toast.LENGTH_SHORT).show();
            }
        });

        //Film sınavına gider
        buttonFilmSorular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sorular.this,"Sınavlar yakında güncellenecektir !", Toast.LENGTH_SHORT).show();
            }
        });

    }
}