package com.mquan86.pattern.creational.abstractfactory.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class MsOffice2008FileFactory implements MsOfficeFileFactory {
    @Override
    public MsWordFile createWordFile() {
        return new MsWord2008File();
    }

    @Override
    public MsExcelFile createExcelFile() {
        return new MsExcel2008File();
    }

}
