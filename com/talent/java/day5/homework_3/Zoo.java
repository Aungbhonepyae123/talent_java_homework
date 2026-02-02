package com.talent.java.day5.homework_3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> myZoo = new ArrayList<>();

        myZoo.add(new Animal("Unknown", 0));
        myZoo.add(new Lion("Simba", 5));
        myZoo.add(new Elephant("MoMo", 10));

        System.out.println("--- Zoo Operations ---");

        for (Animal a : myZoo) {
            a.displayInfo();
            a.makeSound();
            System.out.println("--------------------");
        }
    }
}
