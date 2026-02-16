package com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1.hayvan.Hayvan;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1.hayvan.Kopek;

public class KopekFabrikasi extends HayvanFabrikasi {

    public Hayvan hayvanOlustur() {
        return new Kopek();
    }
}