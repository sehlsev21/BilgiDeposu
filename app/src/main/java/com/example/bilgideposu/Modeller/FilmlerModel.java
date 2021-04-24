package com.example.bilgideposu.Modeller;

public class FilmlerModel {
    private int film_id;
    private String film_ad;
    private String film_resim_ad;
    private String film_tarih;

    public FilmlerModel() {
    }

    public FilmlerModel(int film_id, String film_ad, String film_resim_ad, String film_tarih) {
        this.film_id = film_id;
        this.film_ad = film_ad;
        this.film_resim_ad = film_resim_ad;
        this.film_tarih = film_tarih;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getFilm_ad() {
        return film_ad;
    }

    public void setFilm_ad(String film_ad) {
        this.film_ad = film_ad;
    }

    public String getFilm_resim_ad() {
        return film_resim_ad;
    }

    public void setFilm_resim_ad(String film_resim_ad) {
        this.film_resim_ad = film_resim_ad;
    }

    public String getFilm_tarih() {
        return film_tarih;
    }

    public void setFilm_tarih(String film_tarih) {
        this.film_tarih = film_tarih;
    }
}
