package com.example.designpatterns.yaratimsalKaliplar.singleton.ornek4;

public class DatabaseConnection {

    // Tek örneği tutacak statik değişken
    private static DatabaseConnection instance;

    // Constructor dışarıdan çağrılamaz
    private DatabaseConnection() {
        System.out.println("Veritabanı bağlantisi oluşturuluyor. ");
    }

    // Tek örneği döndüren metot
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Veritabanina bağlaniliyor. ");
    }
}
