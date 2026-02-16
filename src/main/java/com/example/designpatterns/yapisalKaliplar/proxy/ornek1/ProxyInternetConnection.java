package com.example.designpatterns.yapisalKaliplar.proxy.ornek1;

public class ProxyInternetConnection implements InternetConnection {

    private RealInternetConnection realInternetConnection;
    private String userRole;  // Kullanıcı rolü (admin veya diğer)

    public ProxyInternetConnection(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void connect() {
        if (userRole.equals("admin")) {
            // Admin ise gerçek internet bağlantısını kurar
            if (realInternetConnection == null) {
                realInternetConnection = new RealInternetConnection();
            }
            realInternetConnection.connect();
        } else {
            // Admin değilse erişim engellenir
            System.out.println("Erişim engellendi! Kullanıcı 'admin' olmalıdır.");
        }
    }
}
