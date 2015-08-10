package com.mquan86.pattern.creational.singleton.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ConfigurationTest {

    @Test
    public void testGetConfiguration() throws Exception {
        Configuration config1 = Configuration.getConfiguration();
        Configuration config2 = Configuration.getConfiguration();
        assertTrue(config1 == config2);
    }
}
