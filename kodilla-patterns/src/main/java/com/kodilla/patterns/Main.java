package com.kodilla.patterns;

import com.kodilla.patterns.OOP.Animal;
import com.kodilla.patterns.OOP.AnimalRecognizer;
import com.kodilla.patterns.OOP.Dog;
import com.kodilla.patterns.OOP.Male;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        int b = 3;
        System.out.println(i&b);

        AnimalRecognizer animalRecognizer = new AnimalRecognizer();
        String recognized = animalRecognizer.recognize(new Dog());
        System.out.println(recognized);
        Male male = new Male("mat");
    }
}
