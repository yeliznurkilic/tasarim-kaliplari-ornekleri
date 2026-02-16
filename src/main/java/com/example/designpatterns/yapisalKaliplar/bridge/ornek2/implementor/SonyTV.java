package com.example.designpatterns.yapisalKaliplar.bridge.ornek2.implementor;

public class SonyTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("Sony TV açıldı.");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony TV kapandı.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Sony TV kanalı " + channel + " olarak değiştirildi.");
    }
}
