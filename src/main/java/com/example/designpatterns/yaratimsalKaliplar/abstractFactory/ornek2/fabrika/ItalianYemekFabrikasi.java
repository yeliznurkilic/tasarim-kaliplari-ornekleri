package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.AnaYemek;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.ItalianMain;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.ItalianTatli;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.Tatli;

public class ItalianYemekFabrikasi implements YemekFabrikasi {
    @Override
    public AnaYemek createMainDish() {
        return new ItalianMain();
    }

    @Override
    public Tatli createDessert() {
        return new ItalianTatli();
    }
}

