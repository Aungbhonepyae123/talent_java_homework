package com.talent.java.day6.homework_1;

public class HourlyEmployee extends Employee {
    //Fields
    private double hourlyRate;
    private double hoursWorked;

    //Constructor
    public HourlyEmployee(String name, int id, double hourlyRate, double hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyRate;
        } else {
            double regularPay = 40 * hourlyRate;
            int overtimeHours = (int) (hoursWorked - 40);
            double overtimePay = 2 * (overtimeHours * hourlyRate);
            return regularPay + overtimePay;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Hourly)";
    }
}
