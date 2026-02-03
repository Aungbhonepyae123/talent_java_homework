package com.talent.java.day5.homework_1;

public class Person {
    // Fields
    private String name;
    private int age;

    // Constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() { return name; }
    public int getAge() { return age; }

    public String getRole() { return "Person"; }

    public void introduce() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
