package com.example.designpatterns.yaratimsalKaliplar.builder.ornek11;

public class Main {
    public static void main(String[] args) {

        Ev ev1 = new Ev.EvBuilder("İstanbul", "Merkez")
                .odaSayisi(3)   // opsiyonel
                .build();

        Ev ev2 = new Ev.EvBuilder("Diyarbakır", "Merkez")
                .havuz(true)    // opsiyonel
                .build();

        System.out.println(ev1);
        System.out.println(ev2);
    }
}
