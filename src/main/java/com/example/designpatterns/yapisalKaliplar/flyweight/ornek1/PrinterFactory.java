package com.example.designpatterns.yapisalKaliplar.flyweight.ornek1;

import java.util.HashMap;
import java.util.Map;

public class PrinterFactory {
    private Map<String, Printer> printerMap = new HashMap<>();

    public Printer getPrinter(String model, String brand) {
        String key = model + "-" + brand;
        if (!printerMap.containsKey(key)) {
            printerMap.put(key, new ConcretePrinter(model, brand));
            System.out.println("Yeni yazıcı oluşturuldu: " + model + " " + brand);
        }
        return printerMap.get(key);
    }
}
