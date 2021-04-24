package com.example.bilgideposu.Aktiviteler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bilgideposu.Adaptörler.UlkelerAdapter;
import com.example.bilgideposu.Modeller.UlkelerModel;
import com.example.bilgideposu.R;

import java.util.ArrayList;

public class UlkelerActivity extends AppCompatActivity {
    private RecyclerView rv_ulkeler;
    private ArrayList<UlkelerModel> ulkelerArrayList;
    private UlkelerAdapter adapterUlke;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulkeler);

        rv_ulkeler = findViewById(R.id.rv_ulkeler);
        rv_ulkeler.setHasFixedSize(true);

        rv_ulkeler.setLayoutManager(new LinearLayoutManager(this));

        UlkelerModel ulke1 = new UlkelerModel(1,"TÜRKİYE","turkiye");
        UlkelerModel ulke2 = new UlkelerModel(2,"ALMANYA","almanya");
        UlkelerModel ulke3 = new UlkelerModel(3,"BOSNAHERSEK","bosnahersek");
        UlkelerModel ulke4 = new UlkelerModel(4,"FRANSA","fransa");
        UlkelerModel ulke5 = new UlkelerModel(5,"HOLLANDA","hollanda");
        UlkelerModel ulke6 = new UlkelerModel(6,"İSPANYA","ispanya");
        UlkelerModel ulke7 = new UlkelerModel(7,"İTALYA","italya");
        UlkelerModel ulke8 = new UlkelerModel(8,"NORVEÇ","norvec");
        UlkelerModel ulke9 = new UlkelerModel(9,"RUSYA","rusya");
        UlkelerModel ulke10 = new UlkelerModel(10,"YUNANİSTAN","yunanistan");

        ulkelerArrayList = new ArrayList<>();
        ulkelerArrayList.add(ulke1);
        ulkelerArrayList.add(ulke2);
        ulkelerArrayList.add(ulke3);
        ulkelerArrayList.add(ulke4);
        ulkelerArrayList.add(ulke5);
        ulkelerArrayList.add(ulke6);
        ulkelerArrayList.add(ulke7);
        ulkelerArrayList.add(ulke8);
        ulkelerArrayList.add(ulke9);
        ulkelerArrayList.add(ulke10);

        adapterUlke = new UlkelerAdapter(this,ulkelerArrayList);
        rv_ulkeler.setAdapter(adapterUlke);
    }
}