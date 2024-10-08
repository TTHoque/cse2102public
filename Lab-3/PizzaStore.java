public class PizzaStore {
    public static void main(String[] args) {

        PizzaFactory pf = new PizzaStore();
        PizzaInterface myPizza = pf.makePizza(type:"Cheese");

        myPizza.prepare();
        myPizza.bake();
        myPizza.cut();
        myPizza.box();
        
    }
}