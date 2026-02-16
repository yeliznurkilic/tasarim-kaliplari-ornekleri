package com.example.designpatterns.yapisalKaliplar.bridge.ornek2;


import com.example.designpatterns.yapisalKaliplar.bridge.ornek2.implementor.TV;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(TV tv) {
        super(tv);
    }

    @Override
    public void turnOn() {
        tv.turnOn();
    }

    @Override
    public void turnOff() {
        tv.turnOff();
    }

    @Override
    public void changeChannel(int channel) {
        tv.changeChannel(channel);
    }
}
