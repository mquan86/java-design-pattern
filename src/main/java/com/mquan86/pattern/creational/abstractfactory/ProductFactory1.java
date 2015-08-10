package com.mquan86.pattern.creational.abstractfactory;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ProductFactory1 implements ProductFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
