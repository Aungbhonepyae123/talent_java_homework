package com.talent.java.day7.homework7_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Aung Bhone Pyae"));
        studentList.add(new Student(2, "Thamos"));
        studentList.add(new Student(3, "Hein Thu Linn"));
        studentList.add(new Student(4, "Hsu Hsu"));
        studentList.add(new Student(5, "Zaw Zaw"));

        System.out.println("--- Students List ---");
        for (Student s : studentList) {
            System.out.println(s);
        }

        String searchName = "Thamos";
        System.out.println("\n--- Result : (" + searchName + ") ---");
        for (Student s : studentList) {
            if (s.name.equalsIgnoreCase(searchName)) {
                System.out.println("Found- " + s);
            }
        }

        int idToRemove = 2;
        studentList.removeIf(s -> s.id == idToRemove);
        System.out.println("\nID (" + idToRemove + ") removed");

        System.out.println("Current Student List: " + studentList.size());

        System.out.println("\n--- Final Student List---");
        studentList.forEach(System.out::println);
    }
}
