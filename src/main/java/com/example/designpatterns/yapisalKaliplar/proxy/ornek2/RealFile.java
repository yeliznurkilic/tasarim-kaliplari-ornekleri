package com.example.designpatterns.yapisalKaliplar.proxy.ornek2;

public class RealFile implements File {
    private String name;
    public RealFile(String name) {
        this.name = name;
    }
    @Override
    public void read() {
        System.out.println("Reading file "+name);
    }
    @Override
    public void write() {
        System.out.println("Writing file "+name);
    }
    @Override
    public void delete() {
        System.out.println("Deleting file "+name);
    }

}
