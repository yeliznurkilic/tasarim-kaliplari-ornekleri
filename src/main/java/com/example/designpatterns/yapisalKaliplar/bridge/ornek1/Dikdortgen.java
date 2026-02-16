package com.example.designpatterns.yapisalKaliplar.bridge.ornek1;

public class Dikdortgen extends Sekil {
    private double x, y, genislik, yukseklik;

    public Dikdortgen(double x, double y, double genislik, double yukseklik, CizimAPI cizimAPI) {
        super(cizimAPI);  // CizimAPI'yi constructor ile alır
        this.x = x;
        this.y = y;
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }

    @Override
    public void ciz() {
        cizimAPI.dikdortgenCiz(x, y, genislik, yukseklik);  // Platforma özgü çizim yapar
    }
}
