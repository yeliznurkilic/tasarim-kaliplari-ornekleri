package com.example.designpatterns.yaratimsalKaliplar.prototype.ornek3;

public class Triangle implements Shape {

    private String color;
    private int x;
    private int y;

    public Triangle(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public Shape clone() {
        return new Triangle(color, x, y);
    }

    @Override
    public void draw() {
        System.out.println(color + " üçgen çiziliyor (x=" + x + ", y=" + y + ")");
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
