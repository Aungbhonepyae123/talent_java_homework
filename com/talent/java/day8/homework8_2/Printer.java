package com.talent.java.day8.homework8_2;

import java.util.ArrayList;
import java.util.List;

class Printer<T> {
    private List<T> items;

    public Printer() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
