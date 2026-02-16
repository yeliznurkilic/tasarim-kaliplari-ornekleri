package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek2.menu;

public class TurkishMain implements AnaYemek {
    @Override
    public String serve() {
        return "Kebap servis edildi: Lezzetli ve sıcak Türk kebabını tadın!";
    }
}

