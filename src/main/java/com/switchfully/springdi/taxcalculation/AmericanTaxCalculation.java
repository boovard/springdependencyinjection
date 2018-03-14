package com.switchfully.springdi.taxcalculation;

import javax.inject.Named;
import java.math.BigDecimal;

@Named("USTax")
public class AmericanTaxCalculation extends TaxCalculation {

    private BigDecimal lumpSum;

    public AmericanTaxCalculation() {
        super(new BigDecimal(0.18));
        lumpSum = new BigDecimal(950);
    }

    @Override
    public BigDecimal calculateTaxes(BigDecimal yearlyIncome) {
        return super.calculateTaxes(yearlyIncome).add(lumpSum);
    }
}
