package com.example.designpatterns.yapisalKaliplar.composite.ornek4;

public class Main {
    public static void main(String[] args) {
        // Medya öğeleri oluştur
        Media image1 = new Image("image1.jpg");
        Media audio1 = new Audio("audio1.mp3");
        Media video1 = new Video("video1.mp4");

        // Ana klasörü oluştur
        Folder rootFolder = new Folder("Ana Klasör");

        // Alt klasörler oluştur
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        // Medya öğelerini klasörlere ekle
        folder1.addMedia(image1);
        folder1.addMedia(audio1);

        folder2.addMedia(video1);

        // Ana klasöre alt klasörleri ekle
        rootFolder.addMedia(folder1);
        rootFolder.addMedia(folder2);

        // Takım dosyalarını oynat
        rootFolder.play();  // Ana klasörün içindeki öğeleri ve alt klasörleri oynat
    }
}
