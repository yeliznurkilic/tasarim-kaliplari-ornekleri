package com.example.designpatterns.yaratimsalKaliplar.builder.ornek1;

public class Main {
    public static void main(String[] args) {

        House ev = new House.Builder()
                .odaSayisi(4)
                .katSayisi(2)
                .balkon(true)
                .havuz(false)
                .garaj(true)
                .bahce(true)
                .build();

        System.out.println(ev);
    }
}
