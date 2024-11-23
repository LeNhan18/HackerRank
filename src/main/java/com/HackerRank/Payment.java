package com.HackerRank;
import java.text.NumberFormat;
import java.util.Locale;
public class Payment {
    public class Solution {

        public static void main(String[] args) {
            // Sample input: replace this with your input reader logic
            double payment = 12324.134; // Replace this with the actual input value

            // US Locale
            NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
            String us = usFormat.format(payment);

            // India Locale
            Locale indiaLocale = new Locale("en", "IN"); // Create custom locale for India
            NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
            String india = indiaFormat.format(payment);

            // China Locale
            NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            String china = chinaFormat.format(payment);

            // France Locale
            NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String france = franceFormat.format(payment);

            // Print the formatted outputs
            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }

}
