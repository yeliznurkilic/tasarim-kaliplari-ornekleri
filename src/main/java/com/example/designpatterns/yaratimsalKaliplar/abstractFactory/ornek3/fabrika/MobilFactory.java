package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.Controller;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.MobilController;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.MobilUI;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.UI;

public class MobilFactory implements GameFactory {
    @Override
    public Controller createController() {
        return new MobilController();
    }

    @Override
    public UI createUI() {
        return new MobilUI();
    }
}
