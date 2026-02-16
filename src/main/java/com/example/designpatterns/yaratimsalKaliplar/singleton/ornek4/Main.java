package com.example.designpatterns.yaratimsalKaliplar.singleton.ornek4;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();

        // Aynı nesne mi kontrol edelim
        if (db1 == db2) {
            System.out.println("Aynı nesne kullanılıyor! Singleton çalışıyor.");
        } else {
            System.out.println("Farklı nesneler! Hata var.");
        }
    }
}
