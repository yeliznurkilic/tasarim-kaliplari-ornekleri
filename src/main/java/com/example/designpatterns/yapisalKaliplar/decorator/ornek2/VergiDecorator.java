package com.example.designpatterns.yapisalKaliplar.decorator.ornek2;

public class VergiDecorator extends FaturaDecorator{
    public VergiDecorator(Fatura fatura){
        super(fatura);
    }
    @Override
    public double toplamFiyat(){
        return faturaD.toplamFiyat()+150;
    }
}
