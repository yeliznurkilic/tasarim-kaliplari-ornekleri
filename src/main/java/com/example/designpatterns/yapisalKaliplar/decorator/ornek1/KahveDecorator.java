package com.example.designpatterns.yapisalKaliplar.decorator.ornek1;

//abstract class ile oluşturulmuş
public abstract class KahveDecorator implements Kahve {
    protected Kahve decorator;
    public KahveDecorator(Kahve kahve) {
        this.decorator = kahve;
    }
    @Override
    public double fiyat() {
        return decorator.fiyat();
    }
    @Override
    public String icindekiler() {
        return decorator.icindekiler();
    }
}
