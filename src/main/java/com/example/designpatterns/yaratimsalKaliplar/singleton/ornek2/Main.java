package com.example.designpatterns.yaratimsalKaliplar.singleton.ornek2;

public class Main {
    public static void main(String[] args) {

        GunlukKaydedici g1 = GunlukKaydedici.getOrnek();
        GunlukKaydedici g2 = GunlukKaydedici.getOrnek();

        g1.yaz("Uygulama başlatıldı.");
        g2.yaz("Veritabanına bağlanıldı.");

        System.out.println(g1 == g2); // true -> aynı nesne
    }
}
