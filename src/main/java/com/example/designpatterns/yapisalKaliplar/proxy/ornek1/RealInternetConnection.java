package com.example.designpatterns.yapisalKaliplar.proxy.ornek1;

public class RealInternetConnection implements InternetConnection {

    @Override
    public void connect() {
        System.out.println("Bağlantı sağlanıyor: Gerçek internet bağlantısı.");
    }
}
