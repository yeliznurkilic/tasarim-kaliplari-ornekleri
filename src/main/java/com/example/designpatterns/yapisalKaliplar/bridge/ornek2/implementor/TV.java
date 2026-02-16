package com.example.designpatterns.yapisalKaliplar.bridge.ornek2.implementor;

public interface TV {
    void turnOn();  // TV'yi aç
    void turnOff(); // TV'yi kapa
    void changeChannel(int channel); // Kanalı değiştir
}
