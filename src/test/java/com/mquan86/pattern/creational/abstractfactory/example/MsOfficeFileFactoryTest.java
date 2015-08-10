package com.mquan86.pattern.creational.abstractfactory.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MsOfficeFileFactoryTest {
    @Test
    public void testAbstractFactory() throws Exception {
        MsOfficeFileFactory office97Factory = new MsOffice1997FileFactory();
        MsWordFile word97File = office97Factory.createWordFile();
        MsExcelFile excel97File = office97Factory.createExcelFile();

        assertTrue(word97File instanceof MsWord1997File);
        assertTrue(excel97File instanceof MsExcel1997File);


        MsOfficeFileFactory office08Factory = new MsOffice2008FileFactory();
        MsWordFile word08File = office08Factory.createWordFile();
        MsExcelFile excel08File = office08Factory.createExcelFile();

        assertTrue(word08File instanceof MsWord2008File);
        assertTrue(excel08File instanceof MsExcel2008File);
    }
}
