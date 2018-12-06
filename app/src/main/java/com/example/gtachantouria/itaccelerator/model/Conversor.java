package com.example.gtachantouria.itaccelerator.model;

public class Conversor {
    private float mMillas;
    private float mKm;

    public Conversor(){
        this.mMillas = 0;
        this.mKm = 0;
    }

    public float getmMillas() {
        return mMillas;
    }

    public void setMillas(float mMillas) {
        this.mMillas = mMillas;
    }

    public float getKm() {
        return mKm;
    }

    public void convertir(){
        this.mKm = this.mMillas * Float.parseFloat(String.valueOf(1.609));
    }
}