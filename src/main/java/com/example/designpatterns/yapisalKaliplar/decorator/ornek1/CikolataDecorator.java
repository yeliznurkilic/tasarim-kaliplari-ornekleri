package com.example.designpatterns.yapisalKaliplar.decorator.ornek1;

public class CikolataDecorator extends KahveDecorator {

    public CikolataDecorator(Kahve kahve) {
        super(kahve);
    }
    @Override
    public double fiyat() {
        return decorator.fiyat() +30.5;
    }
    @Override
    public String icindekiler() {
        return decorator.icindekiler()+ ", çikolata";
    }
}
