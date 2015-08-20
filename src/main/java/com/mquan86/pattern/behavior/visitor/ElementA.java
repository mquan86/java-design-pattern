package com.mquan86.pattern.behavior.visitor;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ElementA implements Visitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
