package com.example.designpatterns.yapisalKaliplar.composite.ornek2;

import java.util.ArrayList;
import java.util.List;

public class Hafta implements TakvimOgesi {
    private List<TakvimOgesi> gunler = new ArrayList<>(); // Hafta içinde günler olacak

    public void addDay(TakvimOgesi day) {
        gunler.add(day); // Gün ekle
    }

    @Override
    public void goruntule() {
        System.out.println("Hafta:");
        for (TakvimOgesi gun : gunler) {
            gun.goruntule(); // Haftadaki her günü göster
        }
    }
}
