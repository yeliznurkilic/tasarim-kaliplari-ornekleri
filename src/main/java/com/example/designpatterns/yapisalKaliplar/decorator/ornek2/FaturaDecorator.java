package com.example.designpatterns.yapisalKaliplar.decorator.ornek2;

//abstract class
public abstract class FaturaDecorator implements Fatura{
    protected Fatura faturaD;
    public FaturaDecorator(Fatura faturaD) {
        this.faturaD = faturaD;
    }
    @Override
    public double toplamFiyat() {
        return faturaD.toplamFiyat();
    }
}
