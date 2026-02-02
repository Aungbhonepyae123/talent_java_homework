package com.talent.java.day3;

import java.util.Scanner;

public class reverse {

    static String reverseString(String input) {
        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String reverseNmae = reverseString(name);
        System.out.println(reverseNmae);

    }
}



