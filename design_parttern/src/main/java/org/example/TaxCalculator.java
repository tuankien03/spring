package org.example;

public class TaxCalculator {
    private Taxstrategy taxstrategy;

    public TaxCalculator(Taxstrategy taxstrategy) {
        this.taxstrategy = taxstrategy;
    }

    public double calculateTax(double amount) {
        return taxstrategy.calculateTax(amount);
    }

    public void setTaxstrategy(Taxstrategy taxstrategy) {
        this.taxstrategy = taxstrategy;
    }
}
