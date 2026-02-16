package com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.odeme;

public class PaypalOdeme implements Odeme {
    public void OdemeYap(double tutar) {
        System.out.println(tutar + " TL tutarinda PayPal ile odeme yapildi.");
    }
}
