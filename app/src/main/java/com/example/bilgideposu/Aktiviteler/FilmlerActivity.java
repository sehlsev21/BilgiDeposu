package com.example.bilgideposu.Aktiviteler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bilgideposu.Adaptörler.FilmlerAdapter;
import com.example.bilgideposu.Modeller.FilmlerModel;
import com.example.bilgideposu.R;

import java.util.ArrayList;

public class FilmlerActivity extends AppCompatActivity {

    private RecyclerView rv_filmler;
    private ArrayList<FilmlerModel> filmlerArrayList;
    private FilmlerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filmler);

        rv_filmler = findViewById(R.id.rv_filmler);
        rv_filmler.setHasFixedSize(true);

        rv_filmler.setLayoutManager(new LinearLayoutManager(this));

        FilmlerModel film1 = new FilmlerModel(1,"Bir Zamanlar Anadoluda","birzamanlaranadoluda","23 Eylül 2011");
        FilmlerModel film2 = new FilmlerModel(2,"Django","django","18 Ocak 2013");
        FilmlerModel film3 = new FilmlerModel(3,"Interstellar","interstellar","7 Kasım 2014");
        FilmlerModel film4 = new FilmlerModel(4,"The Hateful Eight","thehatefuleight","8 Ocak 2016");
        FilmlerModel film5 = new FilmlerModel(5,"The Pianist","thepianist","28 Şubat 2003");
        FilmlerModel film6 = new FilmlerModel(6,"Inception","inception","30 Temmuz 2010");

        filmlerArrayList = new ArrayList<>();
        filmlerArrayList.add(film1);
        filmlerArrayList.add(film2);
        filmlerArrayList.add(film3);
        filmlerArrayList.add(film4);
        filmlerArrayList.add(film5);
        filmlerArrayList.add(film6);

        adapter = new FilmlerAdapter(this,filmlerArrayList);

        rv_filmler.setAdapter(adapter);

    }
}