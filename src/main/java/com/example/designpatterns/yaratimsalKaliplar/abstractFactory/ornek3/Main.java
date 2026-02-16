package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3;

import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.Controller;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.UI;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.fabrika.GameFactory;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.fabrika.MobilFactory;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.fabrika.PCFactory;

public class Main {
    public static void main(String[] args) {

        // PC oyun fabrikası
        GameFactory pcFactory = new PCFactory();
        Controller pcController = pcFactory.createController();
        UI pcUI = pcFactory.createUI();

        pcController.hareketEt();
        pcUI.ciz();

        System.out.println("-----------------------------");

        // Mobil oyun fabrikası
        GameFactory mobilFactory = new MobilFactory();
        Controller mobilController = mobilFactory.createController();
        UI mobilUI = mobilFactory.createUI();

        mobilController.hareketEt();
        mobilUI.ciz();
    }
}
