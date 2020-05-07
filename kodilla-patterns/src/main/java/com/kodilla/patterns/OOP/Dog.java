package com.kodilla.patterns.OOP;

public class Dog implements Animal {

    public String name() {
        return "Dog";
    }

    public String voice() {
        return "BARK BARK";
    }

    @Override
    public String animalName() {
        return null;
    }

    @Override
    public String animalVoice() {
        return null;
    }
}
