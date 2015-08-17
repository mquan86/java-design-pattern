package com.mquan86.pattern.structural.decorator.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public abstract class WindowDecorator implements Window {
    private Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    public void draw() {
        window.draw();
    }
}
