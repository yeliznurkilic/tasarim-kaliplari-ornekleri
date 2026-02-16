package com.example.designpatterns.yapisalKaliplar.decorator.ornek1;

public class Main {
    public static void main(String[] args) {
        Kahve kahvem= new NormalKahve();
        System.out.println("\niçindekiler: "+ kahvem.icindekiler()+ "  Fiyatı: "+ kahvem.fiyat()+ " TL");
        //Şeker eklersem:
        kahvem= new SekerDecorator(kahvem);
        System.out.println("Şeker ekledikten sonra: ");
        System.out.println("içindekiler: "+ kahvem.icindekiler()+ "  Fiyatı: "+ kahvem.fiyat()+ " TL");
        //Süt eklersem:
        kahvem=new SutDecorator(kahvem);
        System.out.println("Süt ekledikten sonra: ");
        System.out.println("içindekiler: "+ kahvem.icindekiler()+ "  Fiyatı: "+ kahvem.fiyat()+ " TL\n\n");

        //Yeni kahve oluşturalım
        Kahve kahvem1= new NormalKahve();
        kahvem1= new SekerDecorator(kahvem1);
        kahvem1= new CikolataDecorator(kahvem1);
        System.out.println("ikinci kahve:");
        System.out.println("içindekiler: "+ kahvem1.icindekiler()+ "  Fiyatı: "+ kahvem1.fiyat()+ " TL");

    }
}
