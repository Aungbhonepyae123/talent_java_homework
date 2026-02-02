package com.talent.java.day3;

public class MultiplicationTable {
    public static void main (String[] args){
        printTable(5, 10);
    }
    static void printTable(int number, int row) {
        System.out.println("   "+ number + " Multiplication Table");
        System.out.println("============================");

        for (int i = 1; i <= row; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
