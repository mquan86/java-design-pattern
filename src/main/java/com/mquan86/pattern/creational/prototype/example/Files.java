package com.mquan86.pattern.creational.prototype.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Files extends Prototype {
    private List<String> filePaths;

    public Files(List<String> filePaths) {
        this.filePaths = filePaths;
    }

    @Override
    public Object clone() {
        List<String> clonedFilePaths = new ArrayList<String>();
        clonedFilePaths.addAll(filePaths);
        return new Files(clonedFilePaths);
    }

    public List<String> getFilePaths() {
        return filePaths;
    }

    public void setFilePaths(List<String> filePaths) {
        this.filePaths = filePaths;
    }
}
