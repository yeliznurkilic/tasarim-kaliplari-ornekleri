package com.example.designpatterns.yapisalKaliplar.bridge.ornek1;

public class Cember extends Sekil {
    private double x, y, yaricap;

    public Cember(double x, double y, double yaricap, CizimAPI cizimAPI) {
        super(cizimAPI);  // CizimAPI'yi constructor ile alır
        this.x = x;
        this.y = y;
        this.yaricap = yaricap;
    }

    @Override
    public void ciz() {
        cizimAPI.cemberCiz(x, y, yaricap);  // Platforma özgü çizim yapar
    }
}
