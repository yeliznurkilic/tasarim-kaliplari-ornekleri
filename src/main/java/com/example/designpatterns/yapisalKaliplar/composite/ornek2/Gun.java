package com.example.designpatterns.yapisalKaliplar.composite.ornek2;

public class Gun implements TakvimOgesi {
    private String gunIsmi;

    public Gun(String gunIsmi){
        this.gunIsmi=gunIsmi;
    }

    @Override
    public void goruntule() {
        System.out.println("Gün: "+ gunIsmi);
    }
}
