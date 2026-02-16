package com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.odeme.Odeme;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.odeme.PaypalOdeme;

public class PaypalFabrikasi extends OdemeFabrikasi{
    public Odeme odemeOlustur(){
        return new PaypalOdeme();
    }
}
