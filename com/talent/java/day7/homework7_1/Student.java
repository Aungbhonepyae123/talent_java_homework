package com.talent.java.day7.homework7_1;

class Student {
    // Field
    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name;
    }
}
