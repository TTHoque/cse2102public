package com.mycompany.app;

public class GlutenFreePizza {
    int phase;

    public GlutenFreePizza() {
        this.phase = 0;
        System.out.println("GlutenFree Pizza");
    }

    public void prepare() { 
        if (phase == 0) {
            System.out.println("----preparing a gluten free pizza");
            phase++;
        }
    }

    public void bake() { 
        if (phase == 1) {
            System.out.println("---baking a gluten free pizza");
            phase++;
        }
    }
    
    public void cut() { 
        if (phase == 2) {
            System.out.println("--cutting a gluten free pizza");
            phase++;
        }
    }

    public void box() { 
        if (phase == 3) {
            System.out.println("-boxing a gluten free pizza");
            phase++;
        }
    }
}
