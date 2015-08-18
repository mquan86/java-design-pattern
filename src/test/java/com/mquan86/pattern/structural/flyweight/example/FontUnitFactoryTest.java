package com.mquan86.pattern.structural.flyweight.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FontUnitFactoryTest {

    @Test
    public void testGet() throws Exception {
        FontUnitFactory factory = new FontUnitFactory();
        FontUnit charA1 = factory.get('A');
        FontUnit charA2 = factory.get('A');
        FontUnit charA3 = factory.get('A');
        FontUnit charB = factory.get('B');

        assertTrue(charA1 == charA2);
        assertTrue(charA1 == charA3);
        assertTrue(charA1 != charB);
    }
}
