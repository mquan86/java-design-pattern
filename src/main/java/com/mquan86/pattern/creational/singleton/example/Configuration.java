package com.mquan86.pattern.creational.singleton.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Configuration {
    private static final Configuration config = new Configuration();

    private Configuration() {}

    public static Configuration getConfiguration() {
        return config;
    }
}
