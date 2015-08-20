package com.mquan86.pattern.behavior.visitor.example;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TaxCalculationVisitorTest {
    @Mock
    private Zone1TaxVisitor zone1Tax;

    @Mock
    private Zone2TaxVisitor zone2Tax;

    @Test
    public void testVisitor() throws Exception {
        Book book = new Book();
        Electric electric = new Electric();

        book.accept(zone1Tax);
        electric.accept(zone1Tax);
        verify(zone1Tax, times(1)).visit(any(Book.class));
        verify(zone1Tax, times(1)).visit(any(Electric.class));

        book.accept(zone2Tax);
        electric.accept(zone2Tax);
        verify(zone2Tax, times(1)).visit(any(Book.class));
        verify(zone2Tax, times(1)).visit(any(Electric.class));
    }

}
