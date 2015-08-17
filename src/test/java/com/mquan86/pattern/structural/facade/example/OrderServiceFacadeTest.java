package com.mquan86.pattern.structural.facade.example;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceFacadeTest {
    @Mock
    private BillingSystem billingSystem;

    @Mock
    private PackingSystem packingSystem;

    @Mock
    private ShippingSystem shippingSystem;

    @Test
    public void testDoOrder() throws Exception {
        OrderServiceFacade orderService =
                new OrderServiceFacade(billingSystem, packingSystem, shippingSystem);
        orderService.doOrder();

        verify(billingSystem, times(1)).doBilling();
        verify(packingSystem, times(1)).packItem();
        verify(shippingSystem, times(1)).shipItem();
    }
}
