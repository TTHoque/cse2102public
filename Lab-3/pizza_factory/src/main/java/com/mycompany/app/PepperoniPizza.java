package com.mycompany.app;

public class PepperoniPizza {
    int phase;

    public PepperoniPizza() {
        this.phase = 0;
        System.out.println("Pepperoni Pizza");
    }

    public void prepare() { 
        if (phase == 0) {
            System.out.println("----preparing a pepperoni pizza");
            phase++;
        }
    }

    public void bake() { 
        if (phase == 1) {
            System.out.println("---baking a pepperoni pizza");
            phase++;
        }
    }
    
    public void cut() { 
        if (phase == 2) {
            System.out.println("--cutting a pepperoni pizza");
            phase++;
        }
    }
    
    public void box() { 
        if (phase == 3) {
            System.out.println("-boxing a pepperoni pizza");
            phase++;
        }
    }
}
