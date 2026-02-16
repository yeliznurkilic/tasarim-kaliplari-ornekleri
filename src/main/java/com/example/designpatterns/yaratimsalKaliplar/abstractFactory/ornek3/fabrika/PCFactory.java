package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.Controller;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.PCController;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.PCUI;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.UI;

public class PCFactory implements GameFactory {
    @Override
    public Controller createController() {
        return new PCController();
    }

    @Override
    public UI createUI() {
        return new PCUI();
    }
}

