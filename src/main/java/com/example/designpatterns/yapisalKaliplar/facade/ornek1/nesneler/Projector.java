package com.example.designpatterns.yapisalKaliplar.facade.ornek1.nesneler;

public class Projector {
    public void turnOn() {
        System.out.println("Projektör açıldı.");
    }

    public void turnOff() {
        System.out.println("Projektör kapandı.");
    }
    public void setResolution(String resolution) {
        System.out.println("Çözünürlük ayarlandı:"+ resolution);
    }
}
