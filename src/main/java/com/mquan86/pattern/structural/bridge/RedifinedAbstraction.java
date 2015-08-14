package com.mquan86.pattern.structural.bridge;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class RedifinedAbstraction extends Abstraction {
    public RedifinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void function() {
        implementor.implemetation();
    }
}
