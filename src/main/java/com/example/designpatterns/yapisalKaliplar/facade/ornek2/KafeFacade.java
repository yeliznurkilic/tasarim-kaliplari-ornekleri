package com.example.designpatterns.yapisalKaliplar.facade.ornek2;

public class KafeFacade {
    private Mutfak mutfak;
    private Bar bar;
    private Kasa kasa;

    public KafeFacade() {
        mutfak = new Mutfak();
        bar = new Bar();
        kasa = new Kasa();
    }

    public void siparisVer(String yemek, String icecek, double tutar) {
        // Yemek siparişi verilir
        mutfak.yemekHazirla(yemek);

        // İçecek siparişi verilir
        bar.icecekHazirla(icecek);

        // Ödeme alınır
        kasa.odemeAl(tutar);
    }
}
