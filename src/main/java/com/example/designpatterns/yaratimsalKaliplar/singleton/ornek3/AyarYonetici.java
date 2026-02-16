package com.example.designpatterns.yaratimsalKaliplar.singleton.ornek3;
import java.util.HashMap;
import java.util.Map;

public class AyarYonetici {

    private static AyarYonetici ornek;
    private Map<String, String> ayarlar = new HashMap<>();

    // Kurucu gizli
    private AyarYonetici() {
        // Varsayılan ayarlar
        ayarlar.put("sunucu", "localhost");
        ayarlar.put("port", "8080");
    }

    public static AyarYonetici getOrnek() {
        if (ornek == null) {
            ornek = new AyarYonetici();
        }
        return ornek;
    }

    public String getir(String anahtar) {
        return ayarlar.get(anahtar);
    }

    public void ayarla(String anahtar, String deger) {
        ayarlar.put(anahtar, deger);
    }
}
