package com.talent.java.day7.homework7_3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> guestList = new HashSet<>();

        guestList.add("Ronaldo");
        guestList.add("Messi");
        guestList.add("Sai Sai Khan Hlaing");
        guestList.add("Kyaw Kyaw");
        guestList.add("Sai Sai Khan Hlaing");
        guestList.add("Aung Khant Paing");
        guestList.add("Hsu Hsu");
        guestList.add("Myat");

        System.out.println("--- Unique Guest List ---");
        System.out.println(guestList);

        String checkName = "Aung Khant Paing";
        if (guestList.contains(checkName)) {
            System.out.println("\n" + checkName + " is on the guest list.");
        } else {
            System.out.println("\n" + checkName + " is not invited.");
        }

        String removeName = "Sai Sai Khan Hlaing";
        guestList.remove(removeName);
        System.out.println("\nRemoving: " + removeName);

        System.out.println("Updated Guest List: " + guestList);
        System.out.println("Total number of guests: " + guestList.size());
    }
}
