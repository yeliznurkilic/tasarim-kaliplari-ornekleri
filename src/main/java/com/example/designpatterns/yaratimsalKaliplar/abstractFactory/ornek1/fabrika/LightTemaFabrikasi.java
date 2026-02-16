package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.fabrika;

import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.Button;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.Checkbox;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.LightButon;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.LightCheckbox;

public class LightTemaFabrikasi implements TemaFabrikasi {

    @Override
    public Button butonOlustur() {
        return new LightButon();
    }

    @Override
    public Checkbox checkboxOlustur() {
        return new LightCheckbox();
    }
}
