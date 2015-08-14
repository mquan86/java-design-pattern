package com.mquan86.pattern.structural.composite.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FolderCompositeTest {

    @Test
    public void testComposite() throws Exception {
        File file1 = new File("1");
        File file2 = new File("2");
        File file3 = new File("3");
        File file4 = new File("4");
        File file5 = new File("5");
        File file6 = new File("6");
        File file7 = new File("7");
        File file8 = new File("8");
        File file9 = new File("9");

        Folder folder1 = new Folder("1");
        Folder folder2 = new Folder("2");
        Folder folder3 = new Folder("3");

        folder1.addFile(file1);
        folder1.addFile(file2);
        folder1.addFile(file3);
        folder1.addFile(folder2);
        folder2.addFile(file4);
        folder2.addFile(file5);
        folder2.addFile(file6);
        folder2.addFile(file7);
        folder2.addFile(folder3);
        folder3.addFile(file8);
        folder3.addFile(file9);

        assertEquals(folder1.getFiles().size(), 4);
        assertEquals(folder2.getFiles().size(), 5);
        assertEquals(folder3.getFiles().size(), 2);
    }

}
