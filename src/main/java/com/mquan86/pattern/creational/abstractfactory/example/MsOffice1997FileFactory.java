package com.mquan86.pattern.creational.abstractfactory.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class MsOffice1997FileFactory implements MsOfficeFileFactory {
    @Override
    public MsWordFile createWordFile() {
        return new MsWord1997File();
    }

    @Override
    public MsExcelFile createExcelFile() {
        return new MsExcel1997File();
    }

}
