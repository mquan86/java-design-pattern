package com.mquan86.pattern.behavior.iterator;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ConcreteIterator implements Iterator {
    @SuppressWarnings("unused")
    private Aggregate aggregate;

    public ConcreteIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Context next() {
        // Implement return the next value of Aggregate collection.
        return null;
    }
}
