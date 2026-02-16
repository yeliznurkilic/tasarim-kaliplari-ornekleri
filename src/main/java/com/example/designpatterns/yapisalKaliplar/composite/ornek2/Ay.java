package com.example.designpatterns.yapisalKaliplar.composite.ornek2;

import java.util.ArrayList;
import java.util.List;

public class Ay implements TakvimOgesi{
    private List<TakvimOgesi> haftalar =  new ArrayList<>();

    public void addHafta(TakvimOgesi hafta){
        haftalar.add(hafta);
    }

    @Override
    public void goruntule() {
        System.out.println("Aylar:");
        for (TakvimOgesi hafta : haftalar) {
            hafta.goruntule();
        }
    }
}
