package com.switchfully.springdi.taxcalculation;

import org.springframework.context.annotation.Primary;

import javax.inject.Named;
import java.math.BigDecimal;

@Named
@Primary
public class BelgianTaxCalculation extends TaxCalculation{

    public BelgianTaxCalculation() {
        super(new BigDecimal(0.45));
    }


}
