package com.example.designpatterns.yapisalKaliplar.decorator.ornek1;

public class SekerDecorator extends KahveDecorator {
    public SekerDecorator(Kahve kahve){
        super(kahve);
    }
    @Override
    public double fiyat(){
        return decorator.fiyat() + 15.5;
    }
    @Override
    public String icindekiler() {
        return decorator.icindekiler()+ ", şeker";
    }
}
