package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI;

public class MobilController implements Controller {
    @Override
    public void hareketEt() {
        System.out.println("Mobil kontrolcüsü ile hareket ediliyor");
    }
}
