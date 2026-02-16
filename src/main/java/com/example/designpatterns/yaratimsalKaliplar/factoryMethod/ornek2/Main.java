package com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2;


import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.fabrika.KapidaFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.fabrika.KrediKartiFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.fabrika.OdemeFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.fabrika.PaypalFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.factoryMethod.ornek2.odeme.Odeme;

public class Main {
    public static void main(String[] args) {

        OdemeFabrikasi fabrika1 = new KrediKartiFabrikasi();
        Odeme odeme1 = fabrika1.odemeOlustur();
        odeme1.OdemeYap(150);

        OdemeFabrikasi fabrika2 = new PaypalFabrikasi();
        Odeme odeme2 = fabrika2.odemeOlustur();
        odeme2.OdemeYap(200);

        OdemeFabrikasi fabrika3 = new KapidaFabrikasi();
        Odeme odeme3 = fabrika3.odemeOlustur();
        odeme3.OdemeYap(300);

    }
}
