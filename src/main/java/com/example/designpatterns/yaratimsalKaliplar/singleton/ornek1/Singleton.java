package com.example.designpatterns.yaratimsalKaliplar.singleton.ornek1;

public class Singleton {

    // 1: Tek örneği tutan static değişken
    private static Singleton instance;

    // 2: Constructor private (dışarıdan new yapılamaz)
    private Singleton() {}

    // 3: Nesneye erişmek için static method
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void mesaj() {
        System.out.println("Singleton çalışıyor!");
    }
}
