package com.mquan86.pattern.creational.builder;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Product {
    private final String property1; // required
    private final String property2; // required
    private final String property3; // optional

    public static class ProductBuilder {
        private final String property1; // required
        private final String property2; // required
        private String property3 = ""; // optional

        public ProductBuilder(String property1, String property2) {
            this.property1 = property1;
            this.property2 = property2;
        }

        public ProductBuilder setProperty3(String property3) {
            this.property3 = property3;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public Product(ProductBuilder builder) {
        property1 = builder.property1;
        property2 = builder.property2;
        property3 = builder.property3;
    }

    public String getProperty1() {
        return property1;
    }

    public String getProperty2() {
        return property2;
    }

    public String getProperty3() {
        return property3;
    }
}
