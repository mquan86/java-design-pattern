package com.mquan86.pattern.creational.builder.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DocumentTest {
    @Test
    public void testBuild() throws Exception {
        Document doc = new Document.DocumentBuilder("Design Pattern Book", "Minh Quan Pham")
                .setDescription("All about the design pattern with example").build();

        assertEquals(doc.getName(), "Design Pattern Book");
        assertEquals(doc.getAuthor(), "Minh Quan Pham");
        assertEquals(doc.getDescription(), "All about the design pattern with example");
    }
}
