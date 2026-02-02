package com.talent.java.day5.homework_2;

public class Vehicle {

    private String country;
    private int year;
    private double fuelLevel;
    private String vehicleType;

    public static int totalVehicles = 0;

    public Vehicle(String country, int year, String vehicleType) {
        this.country = country;
        this.year = year;
        this.vehicleType = vehicleType;
        this.fuelLevel = 0.0;
        totalVehicles++;
    }

    public String getCountry() { return country; }
    public int getYear() { return year; }

    public void startEngine() {
        System.out.println("Generic engine starting...");
    }

    public void drive() {
        System.out.println("Generic vehicle driving...");
    }

    public void refuel(double amount) {
        this.fuelLevel += amount;
        System.out.println("Refilled " + amount + "L. Current Fuel: " + this.fuelLevel);
    }

    public String getVehicleType() {
        return "Generic Vehicle";
    }
}