package com.kodilla.patterns.OOP;

public interface Shape {
    void draw();
    default void drawBig(){
        System.out.println("drawing big");
    }
}
