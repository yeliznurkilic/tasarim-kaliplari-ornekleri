package com.example.designpatterns.yapisalKaliplar.adapter.ornek1;

public class Main {
    public static void main(String[] args) {

        AvrupaPriz avrupaPriz = new AvrupaPriz();
        ABDpriz adapter = new PrizAdaptoru(avrupaPriz);
        Cihaz cihaz = new Cihaz(adapter);

        cihaz.calistir();
    }
}
