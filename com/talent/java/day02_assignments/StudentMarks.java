package com.talent.java.day02_assignments;

import java.util.Scanner;

public class StudentMarks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] subjects = {"Myanmar", "Math", "English", "Chemistry", "Physic"};
        double totalMarks = 0;

        for (int i = 0; i < subjects.length; i++) {
            double mark;

            while (true) {
                System.out.print(subjects[i] + " : ");
                mark = sc.nextDouble();

                if (mark >= 0 && mark <= 100) {
                    totalMarks += mark;
                    break;

                } else {
                    System.out.println("Invalid! Please enter marks between 0 and 100.");
                }
            }
        }

        double average = totalMarks / subjects.length;

        char grade;

        if (average >= 80) grade = 'A';
        else if (average >= 60) grade = 'B';
        else if (average >= 40) grade = 'C';
        else grade = 'D';

        System.out.println("\n--- Final Result ---");
        System.out.println(" Your Grade is " + grade);

        sc.close();
    }
}
