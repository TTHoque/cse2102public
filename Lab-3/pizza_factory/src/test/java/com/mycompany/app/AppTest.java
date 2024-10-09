package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    PizzaFactory pf = new PizzaFactory();
    PizzaStore store = new PizzaStore();

    @Test
    public void CheesePizza() {
        CheesePizza cpizza = store.getCheesePizza();
        assertTrue(cpizza.phase == 4);
    }

    @Test
    public void GlutenFreePizza() {
        GlutenFreePizza gfpizza = store.getGlutenFreePizza();
        assertTrue(gfpizza.phase == 4);
    }

    @Test
    public void GreekPizza() {
        GreekPizza gpizza = store.getGreekPizza();
        assertTrue(gpizza.phase == 4);
    }

    @Test
    public void PepperoniPizza() {
        PepperoniPizza ppizza = store.getPepperoniPizza();
        assertTrue(ppizza.phase == 4);
    }

    @Test 
    public void WrongOrder() {
        CheesePizza pizza = ((CheesePizza) pf.wantPizza("cheese"));
        pizza.bake();
        pizza.cut();
        pizza.box();
        assertTrue(pizza.phase == 0);
        pizza.isItDone();
        assertTrue(pizza.phase == 4);
    }
}
