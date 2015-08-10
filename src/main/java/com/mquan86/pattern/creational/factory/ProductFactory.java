package com.mquan86.pattern.creational.factory;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ProductFactory {
    private ProductFactory() {}

    public static Product getInstance(ProductType type) {
        switch (type) {
            case PRODUCT1:
                return new Product1();
            case PRODUCT2:
                return new Product2();
            default:
                return null;
        }
    }
}
