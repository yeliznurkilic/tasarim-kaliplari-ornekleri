package com.example.designpatterns.yaratimsalKaliplar.prototype.ornek3;

public class Main {
    public static void main(String[] args) {

        // 1) Orijinal Circle oluştur
        Circle originalCircle = new Circle("Kırmızı", 10, 20);

        // 2) Klon oluştur
        Circle clonedCircle = (Circle) originalCircle.clone();

        // 3) Klonun pozisyonunu değiştir
        clonedCircle.setPosition(50, 80);

        // 4) Orijinal ve klonu çiz
        System.out.print("Orijinal: ");
        originalCircle.draw();

        System.out.print("Klon: ");
        clonedCircle.draw();
    }
}
/*
Daire (Circle)

Dikdörtgen (Rectangle)

Üçgen (Triangle)
Her şeklin ortak özellikleri:

renk

x, y koordinatı

Her şekil bu özellikleri kullanarak kendini çizebiliyor.
Ayrıca her şekil klonlanabilir olmalı (Prototype).
 */