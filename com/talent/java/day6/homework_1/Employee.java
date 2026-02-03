package com.talent.java.day6.homework_1;

public abstract class Employee {
    //Fields
    protected String name;
    protected int id;

    //Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculatePay();

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s", id, name);
    }
}
