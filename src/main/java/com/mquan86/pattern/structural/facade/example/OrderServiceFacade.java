package com.mquan86.pattern.structural.facade.example;

/**
 * @author Minh Quan Pham (mquan86@gmail.com)
 *
 */
public class OrderServiceFacade {
    private BillingSystem billingSystem;
    private PackingSystem packingSystem;
    private ShippingSystem shippingSystem;

    public OrderServiceFacade(BillingSystem billingSystem, PackingSystem packingSystem,
            ShippingSystem shippingSystem) {
        this.billingSystem = billingSystem;
        this.packingSystem = packingSystem;
        this.shippingSystem = shippingSystem;
    }

    public void doOrder() {
        billingSystem.doBilling();
        packingSystem.packItem();
        shippingSystem.shipItem();
    }
}
