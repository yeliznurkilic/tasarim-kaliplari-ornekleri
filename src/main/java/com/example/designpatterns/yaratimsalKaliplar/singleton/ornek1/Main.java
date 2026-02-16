package com.example.designpatterns.yaratimsalKaliplar.singleton.ornek1;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // true -> aynı nesne

        s1.mesaj();
    }
}
