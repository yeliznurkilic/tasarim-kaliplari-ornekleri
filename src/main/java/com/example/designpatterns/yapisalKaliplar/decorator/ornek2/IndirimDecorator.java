package com.example.designpatterns.yapisalKaliplar.decorator.ornek2;

public class IndirimDecorator extends FaturaDecorator{
    public IndirimDecorator(Fatura fatura){
        super(fatura);
    }
    @Override
    public double toplamFiyat(){
        return faturaD.toplamFiyat()-50;
    }
}
