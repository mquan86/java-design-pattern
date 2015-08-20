package com.mquan86.pattern.behavior.visitor.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public interface ProductVisitable {
    public void accept(TaxCalculationVisitor visitor);
}
