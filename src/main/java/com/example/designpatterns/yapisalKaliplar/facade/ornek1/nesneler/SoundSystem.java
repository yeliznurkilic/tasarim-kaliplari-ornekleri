package com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler;

public class SoundSystem {
    public void turnOn() {
        System.out.println("Ses sistemi açıldı.");
    }

    public void turnOff() {
        System.out.println("Ses sistemi kapandı.");
    }

    public void setVolume(int volume) {
        System.out.println("Ses seviyesi ayarlandı: " + volume);
    }
}
