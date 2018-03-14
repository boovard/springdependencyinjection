package com.switchfully.springdi.taxcalculation;

import javax.inject.Named;
import java.math.BigDecimal;

@Named("FrenchTax")
public class FrenchTaxCalculation extends TaxCalculation{

    public FrenchTaxCalculation() {
        super(new BigDecimal(0.48));
    }
}
