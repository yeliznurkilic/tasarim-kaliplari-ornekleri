package com.example.designpatterns.yapisalKaliplar.decorator.ornek1;

public class NormalKahve implements Kahve{

    @Override
    public double fiyat(){
        return 80.0;
    }

    @Override
    public String icindekiler(){
        return "Sade Kahve";
    }
}
