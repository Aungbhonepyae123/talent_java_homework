package com.talent.java.day5.homework_1;

public class Student extends Person {
    private int gradeLevel;

    public Student(String name, int age, int gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String getRole() { return "Student"; }

    @Override
    public void introduce() {

        System.out.println("Hi, I'm " + getName() + ". I'm a grade " + gradeLevel + " student.");
    }
}
