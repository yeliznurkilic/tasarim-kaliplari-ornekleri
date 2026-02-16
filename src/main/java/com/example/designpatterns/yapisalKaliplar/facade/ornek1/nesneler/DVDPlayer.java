package com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler;

public class DVDPlayer {
    public void turnOn(){
        System.out.println("Dvd oynatıcı açıldı");
    }
    public void turnOff(){
        System.out.println("Dvd oynatıcı kapandı.");
    }
    public void play(String movie){
        System.out.println("Film oynatılıyor: " + movie);
    }
    public void stop() {
        System.out.println("Film durduruldu.");
    }
}
