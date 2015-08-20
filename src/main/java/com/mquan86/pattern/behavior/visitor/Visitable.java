package com.mquan86.pattern.behavior.visitor;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public interface Visitable {
    public void accept(Visitor visitor);
}
