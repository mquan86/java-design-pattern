package com.mquan86.pattern.behavior.visitor.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public interface TaxCalculationVisitor {
    public void visit(Book elementA);

    public void visit(Electric elementB);
}
