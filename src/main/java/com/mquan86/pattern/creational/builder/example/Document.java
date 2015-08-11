package com.mquan86.pattern.creational.builder.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class Document {
    private final String name;
    private final String author;
    private final String description;

    public static class DocumentBuilder {
        private final String name;
        private final String author;
        private String description = "";

        public DocumentBuilder(String name, String author) {
            this.name = name;
            this.author = author;
        }

        public DocumentBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Document build() {
            return new Document(this);
        }
    }

    private Document(DocumentBuilder builder) {
        name = builder.name;
        author = builder.author;
        description = builder.description;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }
}
