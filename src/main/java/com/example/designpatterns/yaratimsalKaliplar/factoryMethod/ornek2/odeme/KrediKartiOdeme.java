package com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.odeme;

public class KrediKartiOdeme implements Odeme {
    public void OdemeYap(double tutar) {
        System.out.println(tutar + " TL tutarinda kredi karti ile odeme yapildi.");
    }
}
