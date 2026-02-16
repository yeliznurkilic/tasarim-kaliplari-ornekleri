package com.example.designpatterns.yapisalKaliplar.proxy.ornek2;

public class Main {
    public static void main(String[] args) {
        File adminFile = new FileProxy("admin", "testfile.txt");
        adminFile.read();    // Okuma işlemi
        adminFile.write();   // Yazma işlemi
        adminFile.delete();  // Silme işlemi (admin olabilir)

        System.out.println("\n=====================\n");

        // User rolü ile dosya işlemleri
        File userFile = new FileProxy("user", "testfile.txt");
        userFile.read();     // Okuma işlemi
        userFile.write();    // Yazma işlemi
        userFile.delete();   // Silme işlemi (erişim engellenir)
    }
}
