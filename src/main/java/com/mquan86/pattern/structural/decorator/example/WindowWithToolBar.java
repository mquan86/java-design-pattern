package com.mquan86.pattern.structural.decorator.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class WindowWithToolBar extends WindowDecorator {

    public WindowWithToolBar(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        drawToolBar();
    }

    public void drawToolBar() {}
}
