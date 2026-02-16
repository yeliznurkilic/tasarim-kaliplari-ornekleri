package com.example.designpatterns.yapisalKaliplar.facade.ornek2;

public class Main {
    public static void main(String[] args) {
        // Facade nesnesi oluşturulur
        KafeFacade kafeFacade = new KafeFacade();

        // Müşteri sipariş verir
        kafeFacade.siparisVer("Pizza", "Coca-Cola", 45.0);
    }
}
