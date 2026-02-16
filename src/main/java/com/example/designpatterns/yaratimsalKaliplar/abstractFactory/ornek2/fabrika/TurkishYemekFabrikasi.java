package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.AnaYemek;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.Tatli;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.TurkishDessert;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.TurkishMain;

public class TurkishYemekFabrikasi implements YemekFabrikasi {
    @Override
    public AnaYemek createMainDish() {
        return new TurkishMain();
    }

    @Override
    public Tatli createDessert() {
        return new TurkishDessert();
    }
}

