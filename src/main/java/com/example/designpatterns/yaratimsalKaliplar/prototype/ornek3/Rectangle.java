package com.example.designpatterns.yaratimsalKaliplar.prototype.ornek3;

public class Rectangle implements Shape {

    private String color;
    private int x;
    private int y;

    public Rectangle(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public Shape clone() {
        return new Rectangle(color, x, y);
    }

    @Override
    public void draw() {
        System.out.println(color + " dikdörtgen çiziliyor (x=" + x + ", y=" + y + ")");
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
