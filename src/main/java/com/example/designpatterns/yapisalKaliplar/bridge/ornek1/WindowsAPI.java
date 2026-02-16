package com.example.designpatterns.yapisalKaliplar.bridge.ornek1;

public class WindowsAPI implements CizimAPI {
    @Override
    public void cemberCiz(double x, double y, double yaricap) {
        System.out.println("Windows: Çember çizildi, merkez: (" + x + "," + y + "), yarıçap: " + yaricap);
    }

    @Override
    public void dikdortgenCiz(double x, double y, double genislik, double yukseklik) {
        System.out.println("Windows: Dikdörtgen çizildi, konum: (" + x + "," + y + "), genişlik: " + genislik + ", yükseklik: " + yukseklik);
    }
}
