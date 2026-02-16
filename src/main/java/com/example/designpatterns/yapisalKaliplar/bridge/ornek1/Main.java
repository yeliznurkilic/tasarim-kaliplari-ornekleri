package com.example.designpatterns.yapisalKaliplar.bridge.ornek1;
public class Main {
    public static void main(String[] args) {
        // Farklı platformlar için CizimAPI nesneleri oluşturuluyor
        CizimAPI windowsAPI = new WindowsAPI();
        CizimAPI macAPI = new MacAPI();

        // Cember ve Dikdortgen nesnelerini platforma göre çizdiriyoruz
        Sekil cember = new Cember(5, 10, 7, windowsAPI);
        Sekil dikdortgen = new Dikdortgen(15, 25, 30, 40, macAPI);

        // Sekilleri çizdir
        cember.ciz();
        dikdortgen.ciz();
    }
}
