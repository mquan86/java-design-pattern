package com.mquan86.pattern.behavior.iterator;

import java.util.List;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class ConcreteAggregate implements Aggregate {
    // Aggregate store many Context object.
    @SuppressWarnings("unused")
    private List<Context> contexts;

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(this);
    }
}
