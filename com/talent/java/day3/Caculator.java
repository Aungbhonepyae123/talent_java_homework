package com.talent.java.day3;

public class Caculator{

    static int multiply(int a, int b){
        return a * b ;
    }
    static int multiply(int a, int b, int c){
        return a * b * c;
    }

    public static void main(String[] args) {
        int result1 = multiply(5,10);
        int result2 = multiply(5,10,2);

        System.out.println("5 * 10 = " + result1);
        System.out.println("5 * 10 * 2 = " + result2);
    }

}
