package com.mquan86.pattern.structural.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Folder implements FileSystem {
    private String name;
    private List<FileSystem> files;

    public Folder(String name) {
        this.name = name;
        files = new ArrayList<FileSystem>();
    }

    @Override
    public String getName() {
        return name;
    }

    public void addFile(FileSystem file) {
        files.add(file);
    }

    public List<FileSystem> getFiles() {
        return files;
    }
}
