package com.talent.java.day5.homework_2;

public class Car extends Vehicle {

    public Car(String country, int year) {
        super(country, year, "Car");
    }

    @Override
    public void startEngine() {
        System.out.println("Car: Ignition on. Smooth engine sound.");
    }

    @Override
    public void drive() {

        System.out.println("Car: Driving on 4 wheels. Origin: " + getCountry());
    }

    @Override
    public String getVehicleType() {
        return "Car Class";
    }
}
