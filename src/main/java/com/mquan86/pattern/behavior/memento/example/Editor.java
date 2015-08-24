package com.mquan86.pattern.behavior.memento.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Editor {
    private String text;
    private int currsorPosition;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCurrsorPosition() {
        return currsorPosition;
    }

    public void setCurrsorPosition(int currsorPosition) {
        this.currsorPosition = currsorPosition;
    }

    public ContentMemento createUndoMemento() {
        return new ContentMemento(text, currsorPosition);
    }

    public void restoreFromUndoMemento(ContentMemento memento) {
        this.text = memento.getText();
        this.currsorPosition = memento.getCurrsorPosition();
    }
}
