package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2;


import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.fabrika.ItalianYemekFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.fabrika.TurkishYemekFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.fabrika.YemekFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.AnaYemek;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu.Tatli;

public class Main {
    public static void main(String[] args) {
        YemekFabrikasi italian = new ItalianYemekFabrikasi();
        YemekFabrikasi turkish = new TurkishYemekFabrikasi();

        System.out.println("=== İtalyan Menüsü ===");
        AnaYemek iMain = italian.createMainDish();
        Tatli iDessert = italian.createDessert();
        System.out.println(iMain.serve());
        System.out.println(iDessert.serve());

        System.out.println();

        System.out.println("=== Türk Menüsü ===");
        AnaYemek tMain = turkish.createMainDish();
        Tatli tDessert = turkish.createDessert();
        System.out.println(tMain.serve());
        System.out.println(tDessert.serve());
    }
}
