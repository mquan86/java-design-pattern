package com.mquan86.pattern.creational.factory.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class FileFactory {
    private FileFactory() {}

    public static File createNewFile(FileType fileType) {
        switch (fileType) {
            case TEXT_FILE:
                return new TextFile();
            case XML_FILE:
                return new XmlFile();
            default:
                return null;
        }
    }
}
