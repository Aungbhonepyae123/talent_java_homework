package com.talent.java.day8.homework8_2;

public class Main {
    public static void main(String[] args) {

        Printer<Integer> intPrinter = new Printer<>();
        intPrinter.add(10);
        intPrinter.add(20);
        System.out.println("--- Integer Printer ---");
        intPrinter.printAll();

        Printer<Double> doublePrinter = new Printer<>();
        doublePrinter.add(5.5);
        doublePrinter.add(12.99);
        System.out.println("\n--- Double Printer ---");
        doublePrinter.printAll();
    }
}
