package com.example.designpatterns.yaratimsalKaliplar.prototype.ornek1;

public class Araba implements Prototype {

    private String marka;
    private String model;
    private int yil;

    public Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    @Override
    public Prototype clone() {
        return new Araba(marka, model, yil);  // aynı değerlerle yeni obje
    }

    @Override
    public String toString() {
        return marka + " - " + model + " - " + yil;
    }
}
