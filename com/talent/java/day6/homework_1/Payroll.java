package com.talent.java.day6.homework_1;

import java.util.ArrayList;
import java.util.List;

public class Payroll {
    public static void main(String[] args) {
        List<Employee> staff = new ArrayList<>();

        staff.add(new HourlyEmployee("Aung Aung", 404, 4000.0, 45));
        staff.add(new SalariedEmployee("Kyaw Kyaw", 969, 600000.0));

        System.out.println("--- Monthly Payroll Report ---");
        for (Employee emp : staff) {
            double pay = emp.calculatePay();
            System.out.println(emp.toString() + " | Monthly Pay: " + pay);
        }
    }
}
