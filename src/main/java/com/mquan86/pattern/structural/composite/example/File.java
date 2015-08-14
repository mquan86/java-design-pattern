package com.mquan86.pattern.structural.composite.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class File implements FileSystem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
