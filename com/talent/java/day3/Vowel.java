package com.talent.java.day3;

public class Vowel {
    public static void main(String[] args) {
        String text = "Hello Java Programming";

        int result = countVowels(text);

        System.out.println("Input : " + text);
        System.out.println("Vowels: " + result);
    }
    static int countVowels(String input) {
        int count = 0;

        String str = input.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
