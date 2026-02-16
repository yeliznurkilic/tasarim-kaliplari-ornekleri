package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI;

public class PCController implements Controller {
    @Override
    public void hareketEt() {
        System.out.println("PC kontrolcüsü ile hareket ediliyor");
    }
}
