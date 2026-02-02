package com.talent.java.day3;

public class greet {

    static void greet() {
        System.out.println("Hello!");
    }
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet();
        greet("Aung Bhone Pyae");
    }
}