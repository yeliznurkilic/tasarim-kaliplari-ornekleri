package com.example.designpatterns.yaratimsalKaliplar.prototype.ornek3;

public class Circle implements Shape {

    private String color;
    private int x;
    private int y;

    public Circle(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public Shape clone() {
        return new Circle(color, x, y);
    }

    @Override
    public void draw() {
        System.out.println(color + " daire çiziliyor (x=" + x + ", y=" + y + ")");
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
