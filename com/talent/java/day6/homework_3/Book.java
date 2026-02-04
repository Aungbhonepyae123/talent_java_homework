package com.talent.java.day6.homework_3;

public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public double makeDiscount(int percent) {
        double discountAmount = this.price * (percent / 100.0);
        this.price = this.price - discountAmount;
        return this.price;
    }

//    @Override
//    public String toString() {
//        return String.format("Title: %-15s | Author: %-10s | Price: $%.2f",
//                title, author, price);
//    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
