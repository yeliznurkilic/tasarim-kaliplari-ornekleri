package com.example.designpatterns.yapisalKaliplar.bridge.ornek2;


import com.example.designpatterns.yapisalKaliplar.bridge.ornek2.implementor.SamsungTV;
import com.example.designpatterns.yapisalKaliplar.bridge.ornek2.implementor.SonyTV;

public class Main {
    public static void main(String[] args) {
        // TV nesneleri oluşturuluyor
        SonyTV sonyTV = new SonyTV();
        SamsungTV samsungTV = new SamsungTV();

        // Uzaktan kumandalar oluşturuluyor
        RemoteControl sonyRemote = new AdvancedRemoteControl(sonyTV);
        RemoteControl samsungRemote = new AdvancedRemoteControl(samsungTV);

        // Sony TV kumandasını kullanarak işlemler
        sonyRemote.turnOn();
        sonyRemote.changeChannel(5);
        sonyRemote.turnOff();

        System.out.println("\n=====================\n");

        // Samsung TV kumandasını kullanarak işlemler
        samsungRemote.turnOn();
        samsungRemote.changeChannel(10);
        samsungRemote.turnOff();
    }
}
