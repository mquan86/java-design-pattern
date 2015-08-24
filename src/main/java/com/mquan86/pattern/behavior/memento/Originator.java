package com.mquan86.pattern.behavior.memento;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}
