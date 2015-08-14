package com.mquan86.pattern.structural.bridge.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public abstract class AbstractButtonDrawing {
    protected Button button;

    public AbstractButtonDrawing(Button button) {
        this.button = button;
    }

    public abstract void draw();
}
