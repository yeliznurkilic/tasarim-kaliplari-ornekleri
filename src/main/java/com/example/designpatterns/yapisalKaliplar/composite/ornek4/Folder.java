package com.example.designpatterns.yapisalKaliplar.composite.ornek4;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Media{
    String folderName;
    private List<Media> medias= new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }
    public void addMedia(Media media){
        medias.add(media);
    }
    public void removeMedia(Media media){
        medias.remove(media);
    }

    @Override
    public void play() {
        System.out.println("Folder: "  + folderName);
        for (Media media : medias) {
            media.play();
        }
    }
}
