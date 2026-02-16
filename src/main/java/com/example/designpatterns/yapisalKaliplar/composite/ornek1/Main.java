package com.example.designpatterns.yapisalKaliplar.composite.ornek1;

public class Main {
    public static void main(String[] args) {

        // Dosyalar
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        // Klasörler
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        // Dosyaları klasöre ekleyelim
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        // Başka bir klasöre dosya ekleyelim
        folder2.addComponent(new File("file3.txt"));

        // Ana klasörü oluştur ve içine başka klasörleri ekle
        Folder rootFolder = new Folder("RootFolder");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        // Şimdi, tüm dosya ve klasörleri aynı şekilde açabiliriz
        rootFolder.open();  // Bu, tüm dosyaları ve klasörleri açacak
    }
}
