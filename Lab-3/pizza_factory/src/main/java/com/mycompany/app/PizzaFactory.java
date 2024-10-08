package com.mycompany.app;

public class PizzaFactory {
    public PizzaInterface wantPizza(String type) {
        if (type == null || type.isEmpty()) {
            System.err.println("Error - no pizza of this type");
            return null;
        }

        switch(type.toLowerCase()) {
            case "greek": return new GreekPizza();
            case "cheese": return new CheesePizza();
            case "pepperoni": return new PepperoniPizza();
            case "glutenfree": return new GlutenFreePizza();
            default: {
                System.err.println("Error - no pizza of this type: " + type.toLowerCase());
                return null;
            }
        }
    }   
}