package com.talent.java.day4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter the desired file name : ");
            String fileName = input.nextLine();
            File myFile = new File(fileName);

            if (myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            }else{
                System.out.println("File already exists.");
            }

            System.out.println("Enter the information you want to describe : ");
            String content = input.nextLine();

            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Successfully worte to the file.");

            System.out.println("Would you like to see the file contents? (yes/no): ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("\n--- File Content ---");
                Scanner reader = new Scanner(myFile);
                while (reader.hasNextLine()){
                    System.out.println(reader.nextLine());
                }
                reader.close();
            }else {
                System.out.println("Thank you.The program is exiting.");
            }

        }catch (IOException e){
            System.out.println("Error !");

        }finally {
            input.close();
        }

    }
}
