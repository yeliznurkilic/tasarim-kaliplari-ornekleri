package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.Controller;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek3.controllerAndUI.UI;

public interface GameFactory {
    Controller createController();
    UI createUI();
}

