package com.talent.java.day7.homework7_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Aung Aung", 85);
        studentMarks.put("Su Su", 92);
        studentMarks.put("Kyaw Kyaw", 78);
        studentMarks.put("Mya Mya", 95);
        studentMarks.put("Zaw Zaw", 88);

        System.out.println("--- Student Records ---");
        Iterator<Map.Entry<String, Integer>> iterator = studentMarks.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Student: " + entry.getKey() + " | Marks: " + entry.getValue());
        }

        String topStudent = null;
        int maxMarks = -1;

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            if (entry.getValue() > maxMarks) {
                maxMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("\nTop Student: " + topStudent + " with " + maxMarks + " marks.");

        studentMarks.remove("Kyaw Kyaw");
        System.out.println("\nRemoving 'Kyaw Kyaw' from the record...");

        System.out.println("Updated Records: " + studentMarks);
    }
}
