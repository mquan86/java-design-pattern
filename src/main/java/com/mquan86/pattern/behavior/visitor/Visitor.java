package com.mquan86.pattern.behavior.visitor;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public interface Visitor {
    public void visit(ElementA elementA);

    public void visit(ElementB elementB);
}
