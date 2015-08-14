package com.mquan86.pattern.structural.bridge.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ButtonGuiDrawing extends AbstractButtonDrawing {
    public ButtonGuiDrawing(Button button) {
        super(button);
    }

    @Override
    public void draw() {
        button.create();
    }

}
