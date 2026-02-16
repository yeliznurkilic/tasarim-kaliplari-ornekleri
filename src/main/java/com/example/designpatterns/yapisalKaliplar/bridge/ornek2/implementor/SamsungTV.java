package com.example.designpatterns.yapisalKaliplar.bridge.ornek2.implementor;

public class SamsungTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("Samsung TV açıldı.");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV kapandı.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Samsung TV kanalı " + channel + " olarak değiştirildi.");
    }
}
