package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.AnaYemek;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.Tatli;

public interface YemekFabrikasi {
    AnaYemek createMainDish();
    Tatli createDessert();
}

