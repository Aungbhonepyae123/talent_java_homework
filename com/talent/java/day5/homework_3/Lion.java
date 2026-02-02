package com.talent.java.day5.homework_3;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion: Roar! ");
    }
}
