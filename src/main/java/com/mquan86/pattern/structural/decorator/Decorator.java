package com.mquan86.pattern.structural.decorator;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
