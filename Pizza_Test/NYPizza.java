public class NYPizza extends AbstractPizza implements Pizza {
    /**
     * constructor for NYPizza
     */
    public NYPizza() {
        this.basePrice = 6.0;
    }

    public static void main(String[] args) {
        NYPizza pizza = new NYPizza();
        Tuna tuna = new Tuna(2);
        Pepperoni pepper = new Pepperoni(2);
        Olives olive = new Olives(2);
        pizza.addToppings(tuna);
        pizza.addToppings(pepper);
        pizza.addToppings(olive);
        // expected answer = 12
        System.out.println(pizza.getTotalPrice());
        pizza.deleteToppings(pepper);
        // expected answer = 10
        System.out.println(pizza.getTotalPrice());
    }
}
