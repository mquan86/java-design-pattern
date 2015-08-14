package com.mquan86.pattern.structural.bridge;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void function();
}
