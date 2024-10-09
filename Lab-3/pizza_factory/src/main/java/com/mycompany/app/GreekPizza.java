package com.mycompany.app;

public class GreekPizza implements PizzaInterface {
    int phase;

    public GreekPizza() {
        this.phase = 0;
        System.out.println("Greek Pizza");
    }

    public void prepare() { 
        if (phase == 0) {
            System.out.println("----preparing a greek pizza");
            phase++;
        }
    }

    public void bake() { 
        if (phase == 1) {
            System.out.println("---baking a greek pizza");
            phase++;
        }
    }
    
    public void cut() { 
        if (phase == 2) {
            System.out.println("--cutting a greek pizza");
            phase++;
        }
    }

    public void box() { 
        if (phase == 3) {
            System.out.println("-boxing a greek pizza");
            phase++;
        }
    }

    public void isItDone() {
        if (phase != 4) {
            System.out.println("It isn't done yet");
            this.prepare();
            this.bake();
            this.cut();
            this.box();
            System.out.println("Finished making a cheese pizza\n");
        } else {
            System.out.println("Finished making a greek pizza\n");
        }
    }
}