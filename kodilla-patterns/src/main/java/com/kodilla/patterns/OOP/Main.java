package com.kodilla.patterns.OOP;

public class Main {
    public static void main(String[] args) {

        Shape circle1 = new Circle();
        ShapeDrawer draw = new ShapeDrawer(circle1);
        draw.process();

        //defalut method
        circle1.drawBig();
    }
}
