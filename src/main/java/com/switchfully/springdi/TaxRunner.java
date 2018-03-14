package com.switchfully.springdi;

import com.switchfully.springdi.taxcalculation.BelgianTaxCalculation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.Annotation;
import java.math.BigDecimal;

@ComponentScan
public class TaxRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaxRunner.class);

        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);
        System.out.println(taxCalculator.calculateTaxes(new BigDecimal(23000)));
    }
}
