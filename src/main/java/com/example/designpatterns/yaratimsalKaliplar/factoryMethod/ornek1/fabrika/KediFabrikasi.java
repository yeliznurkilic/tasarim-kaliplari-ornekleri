package com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1.hayvan.Hayvan;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek1.hayvan.Kedi;

public class KediFabrikasi extends HayvanFabrikasi {

    public Hayvan hayvanOlustur() {
        return new Kedi();
    }
}