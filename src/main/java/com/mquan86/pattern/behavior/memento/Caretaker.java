package com.mquan86.pattern.behavior.memento;

import java.util.Stack;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Caretaker {
    private Stack<Memento> mementos = new Stack<>();

    public void addMemento(Memento memento) {
        mementos.push(memento);
    }

    public Memento getMemento() {
        return mementos.pop();
    }
}
