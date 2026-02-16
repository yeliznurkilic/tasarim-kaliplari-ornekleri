package com.example.designpatterns.yapisalKaliplar.composite.ornek4;

public class Image implements Media {
    private String resim;

    public Image(String resim) {
        this.resim = resim;
    }
    @Override
    public void play() {
        System.out.println("Resim oynatiliyor: " + resim);
    }
}
