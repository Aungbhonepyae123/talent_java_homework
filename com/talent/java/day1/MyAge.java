package com.talent.java.day1;

import java.time.Year;
import java.util.Scanner;

public class MyAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int currentYear = Year.now().getValue();

        System.out.print("Enter the year you were born (YYYY): ");
        int birthYear = input.nextInt();

        int age = currentYear - birthYear;

        System.out.println("In " + currentYear + ", you are " + age + " years old.");

        input.close();
    }
}
