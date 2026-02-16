package com.example.designpatterns.yapisalKaliplar.proxy.ornek1;

public class Main {
    public static void main(String[] args) {
        // Kullanıcı rolü 'user', sadece proxy üzerinden bağlantı sağlanabilir
        InternetConnection userConnection = new ProxyInternetConnection("user");
        userConnection.connect();  // 'user' rolü ile bağlantı sağlanamaz

        // Kullanıcı rolü 'admin', gerçek internet bağlantısı sağlanabilir
        InternetConnection adminConnection = new ProxyInternetConnection("admin");
        adminConnection.connect();  // 'admin' rolü ile gerçek bağlantı sağlanır
    }
}
