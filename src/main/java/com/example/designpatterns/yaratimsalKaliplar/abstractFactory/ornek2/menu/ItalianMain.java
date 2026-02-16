package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu;

public class ItalianMain implements AnaYemek {
    @Override
    public String serve() {
        return "Pizza servis edildi: Sıcak, peynirli İtalyan pizzasını tadın!";
    }
}

