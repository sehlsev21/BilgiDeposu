package com.example.bilgideposu.Adaptörler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bilgideposu.Modeller.FilmlerModel;
import com.example.bilgideposu.R;

import java.util.List;

public class FilmlerAdapter extends RecyclerView.Adapter<FilmlerAdapter.CardViewTasarimTutucuFilm> {
    private Context mContext;
    private List<FilmlerModel> filmlerList;

    public FilmlerAdapter(Context mContext, List<FilmlerModel> filmlerList) {
        this.mContext = mContext;
        this.filmlerList = filmlerList;
    }

    public  class CardViewTasarimTutucuFilm extends RecyclerView.ViewHolder {
        public ImageView imageViewFilmResim;
        public TextView textViewFilmBaslik;
        public TextView textViewFilmTarih;
        public Button buttonFavorilereEkleFilm;

        public CardViewTasarimTutucuFilm(@NonNull View itemView) {
            super(itemView);
            imageViewFilmResim = itemView.findViewById(R.id.imageViewFilmResim);
            textViewFilmBaslik = itemView.findViewById(R.id.textViewFilmBaslik);
            textViewFilmTarih = itemView.findViewById(R.id.textViewFilmTarih);
            buttonFavorilereEkleFilm = itemView.findViewById(R.id.buttonFavorilereEkleFilm);
        }
    }

    @NonNull
    @Override
    public CardViewTasarimTutucuFilm onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemViewFilm = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_film,parent,false);
        return new FilmlerAdapter.CardViewTasarimTutucuFilm(itemViewFilm);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewTasarimTutucuFilm holder, int position) {
        final FilmlerModel film = filmlerList.get(position);

        holder.textViewFilmBaslik.setText(film.getFilm_ad());
        holder.textViewFilmTarih.setText("Çıkış Tarihi: " + film.getFilm_tarih());

        holder.imageViewFilmResim.setImageResource(mContext.getResources()
                .getIdentifier(film.getFilm_resim_ad(),"drawable",mContext.getPackageName()));

        holder.buttonFavorilereEkleFilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,film.getFilm_ad()+"Favorilere Eklendi !",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return filmlerList.size();
    }


}
