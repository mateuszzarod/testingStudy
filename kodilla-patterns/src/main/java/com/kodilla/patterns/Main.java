package com.kodilla.patterns;

import com.kodilla.patterns.OOP.Animal;
import com.kodilla.patterns.OOP.AnimalRecognizer;
import com.kodilla.patterns.OOP.Dog;
import com.kodilla.patterns.OOP.Male;

public class Main {
    public static void main(String[] args) {
        int i = 20;
        int b = 30;
        System.out.println(i&b);

        AnimalRecognizer recognizer = new AnimalRecognizer();
        String recognized = recognizer.recognize(new Dog());
        System.out.println(recognized);
        Male male = new Male("mat");
    }
}
