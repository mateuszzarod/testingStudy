package com.kodilla.patterns.OOP;

class Vehicle {
    private String model;
    private String year;

    public Vehicle(String model, String year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public String getYear() {
        return this.year;
    }
}

class Car extends Vehicle {
    private double engineCapacity;

    public Car(String model, String year, double engineCapacity) {
        super(model, year);
        this.engineCapacity = engineCapacity;
    }

    public void turnOnEngine() {
    }

    public void turnOffEngine() {
    }
}

class App {
    public static void main(String[] args) {
        Car car = new Car("opel", "1111", 2.5);
        car.turnOffEngine();
        String model = car.getModel();
    }
}



