package com.mycompany.app;

public class PizzaStore {
    public static void main(String[] args) {

        PizzaFactory pf = new PizzaFactory();
        PizzaInterface myPizza = pf.wantPizza("cheese");

        myPizza.prepare();
        myPizza.bake();
        myPizza.cut();
        myPizza.box();
        
    }
}