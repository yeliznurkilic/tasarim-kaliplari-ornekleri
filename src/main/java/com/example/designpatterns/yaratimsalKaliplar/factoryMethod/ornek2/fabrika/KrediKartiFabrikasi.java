package com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.fabrika;

import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.odeme.KrediKartiOdeme;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.odeme.Odeme;

public class KrediKartiFabrikasi extends OdemeFabrikasi {
    public Odeme odemeOlustur(){
        return new KrediKartiOdeme();
    }
}
