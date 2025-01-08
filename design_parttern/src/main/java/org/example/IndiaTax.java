package org.example;

public class IndiaTax implements Taxstrategy {
    public double calculateTax(double amount) {
        return amount * 0.18;
    }
}
