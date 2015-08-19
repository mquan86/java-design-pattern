package com.mquan86.pattern.behavior.strategy.example;

import java.io.File;
import java.util.List;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class CompressionUtil {
    private CompressionStrategy strategy;

    public CompressionUtil(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compress(List<File> files) {
        strategy.compress(files);
    }
}
