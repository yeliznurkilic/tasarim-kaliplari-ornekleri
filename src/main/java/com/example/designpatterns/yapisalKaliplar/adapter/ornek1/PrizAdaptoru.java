package com.example.designpatterns.yapisalKaliplar.adapter.ornek1;

public class PrizAdaptoru implements ABDpriz {
    private AvrupaPriz avrupaPriz;

    public PrizAdaptoru(AvrupaPriz avrupaPriz) {
        this.avrupaPriz = avrupaPriz;
    }

    @Override
    public void fiseTakABD() {
        avrupaPriz.fiseTakAvrupa();
        System.out.println("Avrupa prizi ABD prizine uyumlu hale getirildi.");
    }
}
