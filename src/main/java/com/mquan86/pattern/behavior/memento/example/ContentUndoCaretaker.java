package com.mquan86.pattern.behavior.memento.example;

import java.util.Stack;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ContentUndoCaretaker {
    private Stack<ContentMemento> mementos = new Stack<>();

    public void addMemento(ContentMemento memento) {
        mementos.push(memento);
    }

    public ContentMemento getMemento() {
        return mementos.pop();
    }
}
