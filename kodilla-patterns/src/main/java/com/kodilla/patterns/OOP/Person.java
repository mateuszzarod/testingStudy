package com.kodilla.patterns.OOP;

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract void voice();
}
