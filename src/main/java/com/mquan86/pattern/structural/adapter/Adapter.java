package com.mquan86.pattern.structural.adapter;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void methodA() {
        adaptee.methodB();
    }
}
