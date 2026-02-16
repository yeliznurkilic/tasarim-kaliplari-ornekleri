package com.example.designpatterns.yaratimsalKaliplar.prototype.ornek2;

public class Main {
    public static void main(String[] args) {
        StudentCard originalCard = new StudentCard("Ali Veli", "123456", "Bilgisayar Mühendisliği");

        StudentCard clonedCard = (StudentCard) originalCard.clone();
        clonedCard.setName("Ayşe Fatma");
        clonedCard.setStudentId("654321");
        // department aynı kalacak
        System.out.println("Orijinal Öğrenci Kartı: " + originalCard);
        System.out.println("Klonlanmış Öğrenci Kartı: " + clonedCard);
    }
}
