package com.kodilla.patterns.factory.shape;

public class Square implements Shape {
    final String name;
    final double width;

    public Square(final String name, final double width) {
        this.name = name;
        this.width = width;
    }

    @Override
    public String getTheName() {
        return name;
    }

    @Override
    public double getTheField() {
        return Math.pow(width, 2.0);
    }

    @Override
    public double getCircumference() {
        return 4 * width;
    }
}
