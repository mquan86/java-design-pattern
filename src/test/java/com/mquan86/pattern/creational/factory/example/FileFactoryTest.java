package com.mquan86.pattern.creational.factory.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FileFactoryTest {

    @Test
    public void testCreateNewFile() throws Exception {
        File txtFile = FileFactory.createNewFile(FileType.TEXT_FILE);
        File xmlFile = FileFactory.createNewFile(FileType.XML_FILE);

        assertTrue(txtFile instanceof TextFile);
        assertTrue(xmlFile instanceof XmlFile);
    }

}
