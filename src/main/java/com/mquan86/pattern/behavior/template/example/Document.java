package com.mquan86.pattern.behavior.template.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public abstract class Document {

    public String getName() {
        return "name of document";
    }

    public abstract void save();

    public abstract void load();
}
