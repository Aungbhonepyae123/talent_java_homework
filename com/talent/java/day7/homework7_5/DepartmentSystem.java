package com.talent.java.day7.homework7_5;

import java.util.*;

import java.util.*;

public class DepartmentSystem {
    public static void main(String[] args) {

        List<String> studentNames = new ArrayList<>();
        studentNames.add("Aung Aung");
        studentNames.add("Su Su");
        studentNames.add("Kyaw Kyaw");


        Map<String, Set<String>> enrollmentMap = new HashMap<>();

        Set<String> subjects1 = new HashSet<>(Arrays.asList("Java", "Python", "SQL"));
        Set<String> subjects2 = new HashSet<>(Arrays.asList("Java", "HTML", "CSS", "JavaScript"));
        Set<String> subjects3 = new HashSet<>(Arrays.asList("Python", "Machine Learning", "Data Science"));

        enrollmentMap.put("Aung Aung", subjects1);
        enrollmentMap.put("Su Su", subjects2);
        enrollmentMap.put("Kyaw Kyaw", subjects3);

        System.out.println("--- Current Enrollment List ---");
        for (String name : studentNames) {
            System.out.println(name + " is enrolled in: " + enrollmentMap.get(name));
        }

        String targetStudent = "Aung Aung";
        if (enrollmentMap.containsKey(targetStudent)) {
            enrollmentMap.get(targetStudent).add("Cloud Computing");
        }
        System.out.println("\nUpdated " + targetStudent + "'s subjects: " + enrollmentMap.get(targetStudent));

        enrollmentMap.get("Su Su").remove("HTML");
        System.out.println("Updated Su Su's subjects: " + enrollmentMap.get("Su Su"));

        Set<String> allDepartmentSubjects = new HashSet<>();
        for (Set<String> studentSubjects : enrollmentMap.values()) {
            allDepartmentSubjects.addAll(studentSubjects);
        }

        System.out.println("\n--- All Unique Subjects Offered in Department ---");
        System.out.println(allDepartmentSubjects);
        System.out.println("Total unique subjects: " + allDepartmentSubjects.size());
    }
}
