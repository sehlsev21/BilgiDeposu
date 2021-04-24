package com.example.bilgideposu.Modeller;

public class UlkelerModel {
    private int ulkeId;
    private String ulkeAd;
    private String bayrakResimAd;

    public UlkelerModel() {
    }

    public UlkelerModel(int ulkeId, String ulkeAd, String bayrakResimAd) {
        this.ulkeId = ulkeId;
        this.ulkeAd = ulkeAd;
        this.bayrakResimAd = bayrakResimAd;
    }

    public int getUlkeId() {
        return ulkeId;
    }

    public void setUlkeId(int ulkeId) {
        this.ulkeId = ulkeId;
    }

    public String getUlkeAd() {
        return ulkeAd;
    }

    public void setUlkeAd(String ulkeAd) {
        this.ulkeAd = ulkeAd;
    }

    public String getBayrakResimAd() {
        return bayrakResimAd;
    }

    public void setBayrakResimAd(String bayrakResimAd) {
        this.bayrakResimAd = bayrakResimAd;
    }
}
