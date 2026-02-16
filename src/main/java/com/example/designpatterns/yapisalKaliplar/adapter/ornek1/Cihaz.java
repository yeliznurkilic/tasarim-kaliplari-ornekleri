package com.example.designpatterns.yapisalKaliplar.adapter.ornek1;

public class Cihaz {
    ABDpriz abdpriz;
    public Cihaz(ABDpriz abdpriz){
        this.abdpriz=abdpriz;
    }
    public void calistir(){
        System.out.println("Cihaz sarj oluyor...");
        abdpriz.fiseTakABD();
    }
}
