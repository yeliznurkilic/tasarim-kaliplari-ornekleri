package com.example.designpatterns.yaratimsalKaliplar.singleton.ornek3;

public class Main {
    public static void main(String[] args) {

        AyarYonetici ayar = AyarYonetici.getOrnek();

        System.out.println(ayar.getir("sunucu")); // localhost
        ayar.ayarla("sunucu", "192.168.1.10");

        AyarYonetici ayar2 = AyarYonetici.getOrnek();
        System.out.println(ayar2.getir("sunucu")); // 192.168.1.10

        System.out.println(ayar == ayar2); // true
    }
}
