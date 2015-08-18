package com.mquan86.pattern.structural.flyweight.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class FontCharacter implements FontUnit {
    private Character ch;

    // May complex of font property, decorative here.

    public FontCharacter(Character ch) {
        this.ch = ch;
    }

    @Override
    public void draw() {}

    public Character getCh() {
        return ch;
    }
}
