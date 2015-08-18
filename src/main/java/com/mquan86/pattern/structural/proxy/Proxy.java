package com.mquan86.pattern.structural.proxy;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void operation() {
        subject.operation();
    }
}
