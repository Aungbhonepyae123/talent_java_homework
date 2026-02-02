package com.talent.java.day5.homework_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person[] people = {
                new Student("Aung Bhone Pyae", 16, 10),
                new Teacher("U Hla", 40, "Physics"),
                new Student("Hsu ", 15, 9)
        };

        for (Person p : people) {
            System.out.print("[" + p.getRole() + "] ");
            p.introduce();
        }
    }
}

