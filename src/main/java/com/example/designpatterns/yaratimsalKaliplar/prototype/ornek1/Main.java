package com.example.designpatterns.yaratimsalKaliplar.prototype.ornek1;

public class Main {
    public static void main(String[] args) {

        Araba a1 = new Araba("BMW", "3.20", 2020);
        Araba a2 = (Araba) a1.clone(); // klon

        System.out.println(a1);
        System.out.println(a2);
    }
}
