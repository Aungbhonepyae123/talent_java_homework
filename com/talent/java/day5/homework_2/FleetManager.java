package com.talent.java.day5.homework_2;

import java.util.ArrayList;
import java.util.List;

public class FleetManager {
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Car("Germany", 2024));
        fleet.add(new Motorcycle("Japan", 2023));

        for (Vehicle v : fleet) {
            System.out.println("\n--- " + v.getVehicleType() + " ---");
            v.startEngine();
            v.drive();
            v.refuel(15.0);
        }

        System.out.println("\nTotal Vehicles Created: " + Vehicle.totalVehicles);
    }
}
