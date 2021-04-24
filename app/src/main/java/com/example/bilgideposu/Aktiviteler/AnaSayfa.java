package com.example.bilgideposu.Aktiviteler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.bilgideposu.R;

public class AnaSayfa extends AppCompatActivity {
    private Button buttonUlkeler,buttonFilmler,buttonSorular,buttonEczaneler,buttonHakkinda,buttonCikis,buttonFavoriler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

        buttonUlkeler = findViewById(R.id.buttonUlkeler);
        buttonFilmler = findViewById(R.id.buttonFilmler);
        buttonSorular = findViewById(R.id.buttonSorular);
        buttonEczaneler = findViewById(R.id.buttonEczaneler);
        buttonHakkinda = findViewById(R.id.buttonHakkinda);
        buttonFavoriler = findViewById(R.id.buttonFavoriler);
        buttonCikis = findViewById(R.id.buttonCikis);

        //Ülkelere gider
        buttonUlkeler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(AnaSayfa.this,UlkelerActivity.class);
                startActivity(intent1);
            }
        });

        //Filmlere gider
        buttonFilmler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(AnaSayfa.this,FilmlerActivity.class);
                startActivity(intent2);
            }
        });

        //Sorulara gider
        buttonSorular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(AnaSayfa.this,Sorular.class);
                startActivity(intent7);
            }
        });

        //Eczanelere gider
        buttonEczaneler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnaSayfa.this,"Nobetci eczane listesi yakinda gelecektir !", Toast.LENGTH_SHORT).show();
            }
        });

        //Hakkında sayfasına gider
        buttonHakkinda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(AnaSayfa.this,ActivityHakkinda.class);
                startActivity(intent4);
            }
        });

        //Favorilere gider
        buttonFavoriler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(AnaSayfa.this,Favoriler.class);
                startActivity(intent5);
            }
        });

        //Çıkış yapar
        buttonCikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnaSayfa.this,"Cikis basarili !", Toast.LENGTH_SHORT).show();
                Intent intent6 = new Intent(AnaSayfa.this,MainActivity.class);
                startActivity(intent6);
            }
        });
    }
}