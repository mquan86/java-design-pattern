package com.mquan86.pattern.behavior.memento;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
