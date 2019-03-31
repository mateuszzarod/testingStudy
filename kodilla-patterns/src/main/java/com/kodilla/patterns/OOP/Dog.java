package com.kodilla.patterns.OOP;

public class Dog implements Animal {

    public String name() {
        return "Dog";
    }

    @Override
    public String voice() {
        return "BARK BARK";
    }
}
