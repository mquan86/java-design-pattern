package com.mquan86.pattern.creational.abstractfactory.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public interface MsOfficeFileFactory {
    public MsWordFile createWordFile();

    public MsExcelFile createExcelFile();
}
