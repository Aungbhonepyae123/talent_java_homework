package com.talent.java.day3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long result = calculateFactorial(n);
            System.out.println(n + "! = " + result);
        }
        scanner.close();
    }
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

