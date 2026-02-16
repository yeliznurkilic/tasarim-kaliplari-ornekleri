package com.example.designpatterns.yapisalKaliplar.bridge.ornek2;


import com.example.designpatterns.yapisalKaliplar.bridge.ornek2.implementor.TV;

public abstract class RemoteControl {
    protected TV tv;  // TV nesnesine referans

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void turnOn();  // TV'yi açma işlevi
    public abstract void turnOff(); // TV'yi kapama işlevi
    public abstract void changeChannel(int channel); // Kanal değiştirme işlevi
}
