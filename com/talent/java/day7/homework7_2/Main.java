package com.talent.java.day7.homework7_2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> waitingList = new LinkedList<>();

        waitingList.add("Aung Bhone Pyae");
        waitingList.add("Hlwan Paing");
        waitingList.add("Nay Toe");
        waitingList.add("Pyay Ti OO");
        waitingList.add("Myint Myat");

        System.out.println("\nCurrent Waiting List: " + "\n"+ waitingList);

        String servedPerson = waitingList.removeFirst();
        System.out.println("\nServed: " + servedPerson);

        waitingList.addLast("Aung Khant Paing");
        System.out.println("\nAung Khant Paing has joined the end of the queue.");

        System.out.println("\nUpdated Waiting List:");
        for (String name : waitingList) {
            System.out.println("- " + name);
        }

        System.out.println("\nTotal people waiting: " + waitingList.size());
    }
}
