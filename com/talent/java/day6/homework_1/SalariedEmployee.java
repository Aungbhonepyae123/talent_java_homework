package com.talent.java.day6.homework_1;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12.0;
    }

    @Override
    public String toString() {
        return super.toString() + " (Salaried)";
    }
}
