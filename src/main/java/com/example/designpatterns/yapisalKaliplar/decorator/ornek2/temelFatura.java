package com.example.designpatterns.yapisalKaliplar.decorator.ornek2;

public class temelFatura implements Fatura{
    @Override
    public double toplamFiyat() {
        return 300;
    }
}
