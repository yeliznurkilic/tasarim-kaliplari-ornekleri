package com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.fabrika;


import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.Button;
import com.example.designpatterns.yaratimsalKaliplar.abstractFactory.ornek1.butonVeCheckbox.Checkbox;

public interface TemaFabrikasi {
    Button butonOlustur();
    Checkbox checkboxOlustur();
}
