package com.example.designpatterns.yapisalKaliplar.composite.ornek1;

public class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Opening file: " + name);
    }
}
