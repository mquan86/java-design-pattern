package com.mquan86.pattern.structural.decorator.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class WindowWithScrollBar extends WindowDecorator {

    public WindowWithScrollBar(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        drawScrollBar();
    }

    private void drawScrollBar() {}
}
