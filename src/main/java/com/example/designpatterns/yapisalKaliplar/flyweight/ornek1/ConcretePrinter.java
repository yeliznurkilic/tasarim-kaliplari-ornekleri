package com.example.designpatterns.yapisalKaliplar.flyweight.ornek1;

public class ConcretePrinter implements Printer {
    private String model;  // Yazıcının modeli (Paylaşılabilir)
    private String brand;  // Yazıcının markası (Paylaşılabilir)
    private String document;  // Yazdırılacak belge (Özelleştirilebilir)

    public ConcretePrinter(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public void print(String document) {
        this.document = document;
        System.out.println("Yazıcı: " + brand + " " + model + " - Belgeyi yazdırıyor: " + document);
    }

    @Override
    public String getDocument() {
        return this.document;
    }
}
