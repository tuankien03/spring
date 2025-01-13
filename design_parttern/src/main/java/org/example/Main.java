package org.example;

public class Main {
    public static void main(String[] args) {

        TaxCalculator calculator = new TaxCalculator(new Ustax());
        System.out.println(calculator.calculateTax(100));



    }
}