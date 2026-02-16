package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1;


import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.Button;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.Checkbox;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.fabrika.DarkTemaFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.fabrika.LightTemaFabrikasi;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.fabrika.TemaFabrikasi;

public class Main {
    public static void main(String[] args) {

        // Kullanıcı Light tema seçti
        TemaFabrikasi lightTema = new LightTemaFabrikasi();
        Button lightButon = lightTema.butonOlustur();
        Checkbox lightCheckbox = lightTema.checkboxOlustur();

        lightButon.tikla();
        lightCheckbox.sec();


        System.out.println("-----------------------------");


        // Kullanıcı Dark tema seçti
        TemaFabrikasi darkTema = new DarkTemaFabrikasi();
        Button darkButon = darkTema.butonOlustur();
        Checkbox darkCheckbox = darkTema.checkboxOlustur();

        darkButon.tikla();
        darkCheckbox.sec();
    }
}
