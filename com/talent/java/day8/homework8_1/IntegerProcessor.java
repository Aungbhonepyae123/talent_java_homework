package com.talent.java.day8.homework8_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerProcessor {
    public static void main(String[] args) {

        String[] inputs = {"10", "20", "abc", "30", "xyz", "5"};

        List<Integer> validIntegers = new ArrayList<>();

        for (String input : inputs) {
            try {
                Integer value = Integer.valueOf(input);
                validIntegers.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid input: " + input);
            }
        }
        if (!validIntegers.isEmpty()) {
            int sum = 0;
            for (Integer num : validIntegers) {
                sum += num;
            }

            double average = (double) sum / validIntegers.size();
            int min = Collections.min(validIntegers);
            int max = Collections.max(validIntegers);

            System.out.println("\n--- Results ---");
            System.out.println("Valid Integers: " + validIntegers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        } else {
            System.out.println("No valid integers were found to process.");
        }
    }
}
