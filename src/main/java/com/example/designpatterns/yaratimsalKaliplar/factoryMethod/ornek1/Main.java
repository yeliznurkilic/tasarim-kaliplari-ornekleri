package com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1;


import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1.fabrika.HayvanFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1.fabrika.KediFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1.fabrika.KopekFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1.hayvan.Hayvan;

public class Main {
    public static void main(String[] args) {

        HayvanFabrikasi fabrika1 = new KediFabrikasi();
        Hayvan a = fabrika1.hayvanOlustur();
        a.sesCikar(); // Miyav!

        HayvanFabrikasi fabrika2 = new KopekFabrikasi();
        Hayvan kopek = fabrika2.hayvanOlustur();
        kopek.sesCikar(); // Hav hav!
    }
}
