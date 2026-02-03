package com.talent.java.day5.homework_1;

public class Teacher extends Person {
    //fields
    private String subject;

    //constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String getRole() { return "Teacher"; }

    @Override
    public void introduce() {
        System.out.println("Hello, I am " + getName() + ". I teach " + subject + ".");
    }
}