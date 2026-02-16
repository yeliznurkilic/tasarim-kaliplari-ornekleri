package com.example.designpatterns.yapisalKaliplar.adapter.ornek2;

public class Main {
    public static void main(String[] args) {
        // --- 1. Doğrudan modern çaları kullanma (eğer olsaydı)
        // ModernMuzikCalar modernCalar = new GercekModernMuzikCalar();
        // modernCalar.mp3Cal("pop_sarki.mp3");

        // --- 2. Adaptör kullanarak eski sistemi modern arayüze bağlama

        // Uyumsuz hizmetin örneği
        EskiPlakCalar eskiSistem = new EskiPlakCalar();

        // Adaptör oluşturulur ve eski sistemi içine alır.
        ModernMuzikCalar adapter = new PlakCalarAdapter(eskiSistem);

        System.out.println("--- Adaptör Kullanımı ---");

        // Müşteri (main metodu), ModernMuzikCalar arayüzünü kullanarak çalma isteği gönderir.
        adapter.mp3Cal("rock_klasigi.mp3");

        System.out.println("\n--- Desteklenmeyen Format Denemesi ---");
        adapter.flacCal("caz_parcasi.flac");
    }
}
