package org.example;

import java.sql.Connection;

public class Lista02Questao08 {
    public static double iterativeDivide(double... args) {
        double total = 1;
        try {
            for (double i : args) {
                total /= i;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error in division: " + e.getMessage());
        }
        return total;
    }

    public static String toLower(String phrase) {
        String newPhrase = null;
        try{
            newPhrase = phrase.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return newPhrase;
    }
    public static void main(String[] args) {
        System.out.println(iterativeDivide(1,2,3,4,5,6, 0));
    }
}
