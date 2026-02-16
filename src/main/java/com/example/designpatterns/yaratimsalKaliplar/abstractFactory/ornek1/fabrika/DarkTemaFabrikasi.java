package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.Button;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.Checkbox;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.DarkButon;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.DarkCheckbox;

public class DarkTemaFabrikasi implements TemaFabrikasi {

    @Override
    public Button butonOlustur() {
        return new DarkButon();
    }

    @Override
    public Checkbox checkboxOlustur() {
        return new DarkCheckbox();
    }
}
