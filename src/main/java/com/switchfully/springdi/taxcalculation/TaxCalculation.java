package com.switchfully.springdi.taxcalculation;

import java.math.BigDecimal;

public abstract class TaxCalculation {

    private BigDecimal taxRate;

    public TaxCalculation(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal calculateTaxes(BigDecimal yearlyIncome){
        return yearlyIncome.multiply(taxRate);
    }

}
