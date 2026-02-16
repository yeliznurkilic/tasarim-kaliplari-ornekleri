package com.example.designpatterns.yapisalKaliplar.decorator.ornek1;

public class SutDecorator extends KahveDecorator {
    public SutDecorator(Kahve kahve) {
        super(kahve);
    }
    @Override
    public double fiyat(){
        return decorator.fiyat() + 25.0;//süt ekleme ücreti
    }

    @Override
    public String icindekiler() {
        return decorator.icindekiler() + ", süt";
    }

}
