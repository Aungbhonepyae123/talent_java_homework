package com.talent.java.day1;

import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("\nSpelling out your name:");
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            System.out.println(letter);
        }

        input.close();
    }
}
