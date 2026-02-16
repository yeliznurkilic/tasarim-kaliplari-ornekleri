package com.example.designpatterns.yapisalKaliplar.composite.ornek4;

public class Audio implements Media {
    private String ses;

    public  Audio(String ses) {
        this.ses = ses;
    }
    @Override
    public void play() {
        System.out.println("Ses oynatiliyor: " + ses);
    }
}
