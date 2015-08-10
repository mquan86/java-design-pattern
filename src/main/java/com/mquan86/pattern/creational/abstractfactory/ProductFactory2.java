package com.mquan86.pattern.creational.abstractfactory;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ProductFactory2 implements ProductFactory {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
