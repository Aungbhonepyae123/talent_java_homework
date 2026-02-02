package com.talent.java.day5.homework_2;

public class Motorcycle extends Vehicle {

    public Motorcycle(String country, int year) {
        super(country, year, "Motorcycle");
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle: Loud exhaust roar!");
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle: Weaving through lanes.");
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle Class";
    }
}
