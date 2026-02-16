package com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.odeme;

public class KapidaOdeme implements Odeme {
    public void OdemeYap(double tutar) {
        System.out.println(tutar + " TL tutarinda kapida odeme yapildi.");
    }
}
