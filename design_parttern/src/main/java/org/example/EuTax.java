package org.example;

public class EuTax implements Taxstrategy {
    public double calculateTax(double amount) {
        return amount * 0.2;
    }
}
