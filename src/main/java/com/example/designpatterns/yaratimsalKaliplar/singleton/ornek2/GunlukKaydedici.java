package com.example.designpatterns.yaratimsalKaliplar.singleton.ornek2;

public class GunlukKaydedici {

    private static GunlukKaydedici ornek;

    // Kurucu metod özel yapıldı, dışarıdan new yapılmasın
    private GunlukKaydedici() {}

    // Tek örneğe erişmek için kullanılan metod
    public static GunlukKaydedici getOrnek() {
        if (ornek == null) {
            ornek = new GunlukKaydedici();
        }
        return ornek;
    }

    public void yaz(String mesaj) {
        System.out.println("[GÜNLÜK] " + mesaj);
    }
}
