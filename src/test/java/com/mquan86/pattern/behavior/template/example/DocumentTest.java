package com.mquan86.pattern.behavior.template.example;

import org.junit.Test;

public class DocumentTest {

    @Test
    public void testAbstraction() throws Exception {
        Document wordDocument = new WordDocument();
        wordDocument.getName();
        wordDocument.save();
        wordDocument.load();

        Document excelDocument = new ExcelDocument();
        excelDocument.getName();
        excelDocument.save();
        excelDocument.load();
    }
}
