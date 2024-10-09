package com.mycompany.app;

public class PizzaMain {
    public static void main(String[] args) {

        PizzaFactory pf = new PizzaFactory();
        PizzaInterface myPizza = pf.wantPizza("cheese");

        ((CheesePizza) myPizza).prepare();
        ((CheesePizza) myPizza).bake();
        ((CheesePizza) myPizza).cut();
        ((CheesePizza) myPizza).box();
        ((CheesePizza) myPizza).isItDone();
        
    }
}
