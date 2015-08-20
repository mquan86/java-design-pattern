package com.mquan86.pattern.behavior.visitor.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Book implements ProductVisitable {

    @Override
    public void accept(TaxCalculationVisitor visitor) {
        visitor.visit(this);
    }
}
