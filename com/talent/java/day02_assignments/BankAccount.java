package com.talent.java.day02_assignments;

import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your initial balance: ");
        double balance = input.nextDouble();

        int choice;

        do {
            System.out.println("\n===Menu===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    System.out.print("Successfully deposited.");
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = input.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Error: ငွေကြေးမလုံလောက်ပါ။ !");
                    } else {
                        balance -= withdraw;
                        System.out.println("Successfully withdrawn.");
                    }
                    break;
                case 3:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");

            }
        }while (choice != 4);

        input.close();
    }
}
