package com.talent.java.day1;

import java.time.LocalDate;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = input.nextLine();


        LocalDate today = LocalDate.now();


        System.out.println("Hello, World!");
        System.out.println("My name is: " + name);
        System.out.println("Today's date is: " + today);


        input.close();
    }
}
