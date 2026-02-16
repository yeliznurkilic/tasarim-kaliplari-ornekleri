package com.example.designpatterns.yapisalKaliplar.bridge.ornek1;

public abstract class Sekil {
    protected CizimAPI cizimAPI;  // CizimAPI arayüzüne bir referans

    public Sekil(CizimAPI cizimAPI) {
        this.cizimAPI = cizimAPI;
    }

    public abstract void ciz();  // Şekli çizme metodunu soyut olarak tanımlar
}
