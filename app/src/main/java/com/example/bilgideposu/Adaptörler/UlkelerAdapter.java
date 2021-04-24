package com.example.bilgideposu.Adaptörler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bilgideposu.Modeller.UlkelerModel;
import com.example.bilgideposu.R;

import java.util.List;

public class UlkelerAdapter extends RecyclerView.Adapter<UlkelerAdapter.CardViewTasarimTutucuUlke> {
    private Context mContext;
    private List<UlkelerModel> ulkelerList;

    public UlkelerAdapter(Context mContext, List<UlkelerModel> ulkelerList) {
        this.mContext = mContext;
        this.ulkelerList = ulkelerList;
    }

    public class CardViewTasarimTutucuUlke extends RecyclerView.ViewHolder{
        public TextView text_UlkeAdi;
        public ImageView imageBayrak;
        public CardView card_ulke;

        public CardViewTasarimTutucuUlke (View view){
            super(view);
            text_UlkeAdi = view.findViewById(R.id.text_UlkeAdi);
            imageBayrak = view.findViewById(R.id.imageBayrak);
            card_ulke = view.findViewById(R.id.card_ulke);
        }
    }

    @NonNull
    @Override
    public CardViewTasarimTutucuUlke onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemViewUlke = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_ulke,parent,false);
        return new CardViewTasarimTutucuUlke(itemViewUlke);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewTasarimTutucuUlke holder, int position) {
        UlkelerModel ulkeler = ulkelerList.get(position);
        holder.text_UlkeAdi.setText(ulkeler.getUlkeAd());
        holder.imageBayrak.setImageResource(mContext.getResources()
                .getIdentifier(ulkeler.getBayrakResimAd(),"drawable",mContext.getPackageName()));
        
    }

    @Override
    public int getItemCount() {
        return ulkelerList.size();
    }


}
