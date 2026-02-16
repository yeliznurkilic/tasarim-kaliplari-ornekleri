package com.example.designpatterns.yaratimsalKaliplar.builder.ornek2;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.Builder()
                .hamurTipi("İnce Hamur")
                .boy("Büyük Boy")
                .cheese(true)
                .pepperoni(true)
                .bacon(false)
                .build();

        System.out.println(pizza);
    }
}
