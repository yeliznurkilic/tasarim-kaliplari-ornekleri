package com.example.designpatterns.yapisalKaliplar.flyweight.ornek1;

public class Main {
    public static void main(String[] args) {
        // PrinterFactory nesnesi oluşturuluyor
        PrinterFactory printerFactory = new PrinterFactory();

        // Yazıcı nesnelerini oluşturuyoruz
        Printer printer1 = printerFactory.getPrinter("LaserJet Pro", "HP");
        Printer printer2 = printerFactory.getPrinter("LaserJet Pro", "HP");
        Printer printer3 = printerFactory.getPrinter("EcoTank", "Epson");

        // Yazdırma işlemleri
        printer1.print("Belge 1: Kendi Gelişimini Hedefle");
        printer2.print("Belge 2: Yazılım Tasarım Desenleri");
        printer3.print("Belge 3: Yazılım Gelişimini Hedefle");

        // Yazıcıları tekrar kullanıyoruz
        System.out.println("\nYazıcı tekrar kullanıldı:\n");
        printer1.print("Belge 4: Yeni Yazılım Tasarımları");

        // Printer nesnelerinin aynı olup olmadığını kontrol et
        System.out.println("printer1 ve printer2 aynı mı? " + (printer1 == printer2));  // Aynı yazıcıyı paylaşıyor
    }
}
