package com.kodilla.patterns.OOP;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDrawer drawer = new ShapeDrawer(circle);
        drawer.process();

        //defalut method
        circle.drawBig();
    }
}
