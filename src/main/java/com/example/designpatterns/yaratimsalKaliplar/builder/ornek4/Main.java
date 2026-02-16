package com.example.designpatterns.yaratimsalKaliplar.builder.ornek4;

public class Main {
    public static void main(String[] args) {

        User user1 = new User.Builder("ahmet123", "ahmet@example.com")
                .telefon("0555 123 45 67")
                .yas(25)
                .build();

        User user2 = new User.Builder("melis", "melis@example.com")
                .adres("İstanbul / Kadıköy")
                .build();

        System.out.println(user1);
        System.out.println(user2);
     }
}
