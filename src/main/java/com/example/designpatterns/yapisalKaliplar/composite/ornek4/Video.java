package com.example.designpatterns.yapisalKaliplar.composite.ornek4;

public class Video implements Media {
    private String video;
    public Video(String video) {
        this.video = video;
    }
    @Override
    public void play() {
        System.out.println("video oynatiliyor: " + video);
    }
}
