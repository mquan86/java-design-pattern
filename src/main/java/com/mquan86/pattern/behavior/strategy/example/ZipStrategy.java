package com.mquan86.pattern.behavior.strategy.example;

import java.io.File;
import java.util.List;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ZipStrategy implements CompressionStrategy {
    @Override
    public void compress(List<File> files) {}

}
