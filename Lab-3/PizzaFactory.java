public class PizzaFactory {
    public Pizza makePizza(String type) {
        if (type == null || type.isEmpty()) {
            System.err.println("Error - no pizza of this type");
            return null;
        }

        switch(type) {
            case "Greek": return new GreekPizza();
            case "Cheese": return new CheesePizza();
            case "Pepperoni": return new PepperoniPizza();
            case "GlutenFree": return new GlutenFreePizza();
            default: {
                System.err.println("Error - no pizza of this type");
                return null;
            }
        }
    }   
}