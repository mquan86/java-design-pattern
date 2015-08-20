package com.mquan86.pattern.behavior.visitor.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Zone1TaxVisitor implements TaxCalculationVisitor {

    @Override
    public void visit(Book elementA) {}

    @Override
    public void visit(Electric elementB) {}
}
