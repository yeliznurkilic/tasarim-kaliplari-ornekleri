package com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.fabrika;

import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.odeme.KapidaOdeme;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.odeme.Odeme;

public class KapidaFabrikasi extends OdemeFabrikasi {
    public Odeme odemeOlustur(){
        return new KapidaOdeme();
    }
}
