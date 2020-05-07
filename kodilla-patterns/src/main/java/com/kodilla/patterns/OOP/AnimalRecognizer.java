package com.kodilla.patterns.OOP;

public class AnimalRecognizer {

    public String recognize (Animal animal){
        return "my name is" + animal.animalName() + "and i sound like" + animal.animalVoice();
    }

}
