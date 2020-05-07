package com.kodilla.patterns.factory.shape;

public class Rectangle implements Shape{
    final String name;
    final double width;
    final double length;

    public Rectangle(final String name, final double width, final double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getTheName() {
        return name;
    }

    @Override
    public double getTheField() {
        return width * length;
    }
    @Override
    public double getCircumference() {
        return 2 * width + 2 * length;
    }
}
