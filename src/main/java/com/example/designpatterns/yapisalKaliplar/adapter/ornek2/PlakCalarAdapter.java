package com.example.designpatterns.yapisalKaliplar.adapter.ornek2;

public class PlakCalarAdapter implements ModernMuzikCalar {
    private EskiPlakCalar eskiPlakCalar;
    public PlakCalarAdapter(EskiPlakCalar eskiPlakCalar) {
        this.eskiPlakCalar = eskiPlakCalar;
    }

    @Override
    public void mp3Cal(String dosyaAdi) {
        // MP3 isteği geldi, biz bunu plak çalma mantığına adapte ediyoruz.
        System.out.println("Adaptör: MP3 dosyası (" + dosyaAdi + ") Plak formatına dönüştürülüyor...");
        eskiPlakCalar.eskiPlakCal(dosyaAdi); // Gerçek çağrı
    }
    @Override
    public void flacCal(String dosyaAdi) {
        // FLAC çalmayı desteklemiyoruz, bu yüzden bir mesaj gösterebiliriz.
        System.out.println("Adaptör: FLAC formatı (" + dosyaAdi + ") desteklenmiyor. Yalnızca MP3 (Plak) adapte edilebilir.");
    }
}
