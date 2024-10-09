package com.mycompany.app;

public class PizzaStore {
    PizzaFactory pf;

    public PizzaStore() {
        this.pf = new PizzaFactory();
    }

    public CheesePizza getCheesePizza() {
        PizzaInterface cpizza = pf.wantPizza("cheese");
        cpizza.prepare();
        cpizza.bake();
        cpizza.cut();
        cpizza.box();
        cpizza.isItDone();
        return ((CheesePizza) cpizza);
    }

    public GlutenFreePizza getGlutenFreePizza() {
        PizzaInterface gfpizza = pf.wantPizza("glutenfree");
        gfpizza.prepare();
        gfpizza.bake();
        gfpizza.cut();
        gfpizza.box();
        gfpizza.isItDone();
        return ((GlutenFreePizza) gfpizza);
    }

    public GreekPizza getGreekPizza() {
        PizzaInterface gpizza = pf.wantPizza("greek");
        gpizza.prepare();
        gpizza.bake();
        gpizza.cut();
        gpizza.box();
        gpizza.isItDone();
        return ((GreekPizza) gpizza);
    }

    public PepperoniPizza getPepperoniPizza() {
        PizzaInterface ppizza = pf.wantPizza("pepperoni");
        ppizza.prepare();
        ppizza.bake();
        ppizza.cut();
        ppizza.box();
        ppizza.isItDone();
        return ((PepperoniPizza) ppizza);
    }
    
}