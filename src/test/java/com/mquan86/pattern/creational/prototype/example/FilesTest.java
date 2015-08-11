package com.mquan86.pattern.creational.prototype.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FilesTest {

    @Test
    public void testClone() throws Exception {
        List<String> filePaths =
                new ArrayList<String>(Arrays.asList(new String[] {"123", "456", "789"}));

        Files files1 = new Files(filePaths);
        Files files2 = (Files) files1.clone();
        Files files3 = (Files) files1.clone();

        files1.getFilePaths().remove(0);
        files3.getFilePaths().add("345");

        assertEquals(files1.getFilePaths().size(), 2);
        assertEquals(files2.getFilePaths().size(), 3);
        assertEquals(files3.getFilePaths().size(), 4);
    }
}
