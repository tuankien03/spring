package org.example;

public class Ustax implements Taxstrategy {
    public double calculateTax(double amount) {
        return amount * 0.1;
    }
}
