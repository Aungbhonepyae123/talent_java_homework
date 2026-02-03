package com.talent.java.day6.homework_3;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "Alexder", 100.0);
        Book b2 = new Book("Programming Basics", "Sayar Eimaung", 80.0);
        Book b3 = new Book("JavaScript", "Sayar Eimaung", 120.0);

        List<Book> library = new ArrayList<>();
        library.add(b1);
        library.add(b2);
        library.add(b3);

        System.out.println("--- Original Prices ---");
        for (Book b : library) {
            System.out.println(b);
        }

        System.out.println("\nApplying 20% discount to " + b2.makeDiscount(20));

        System.out.println("\n--- Updated Inventory ---");
        for (Book b : library) {
            System.out.println(b);
        }
    }
}
