package com.mquan86.pattern.behavior.memento.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ContentMemento {
    private String text;
    private int currsorPosition;

    public ContentMemento(String text, int currsorPosition) {
        this.text = text;
        this.currsorPosition = currsorPosition;
    }

    public String getText() {
        return text;
    }

    public int getCurrsorPosition() {
        return currsorPosition;
    }
}
