package com.example.designpatterns.yapisalKaliplar.decorator.ornek2;

public class Main {
    public static void main(String[] args) {
        Fatura fatura=new temelFatura();
        System.out.println("normal fiyati: "+fatura.toplamFiyat());
        fatura=new VergiDecorator(fatura);
        System.out.println("vergi fiyatli: "+fatura.toplamFiyat());
        fatura=new IndirimDecorator(fatura);
        System.out.println("indirim fiyatli: "+fatura.toplamFiyat());

    }
}
