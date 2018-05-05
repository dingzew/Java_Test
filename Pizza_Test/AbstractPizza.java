import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizza implements Pizza {
    /**
     * the base price of pizza
     */
    protected double basePrice;
    /**
     * the topping list of the pizza
     */
    protected List<Toppings> toppingsList = new ArrayList<>();

    /**
     * get the total price of the pizza
     * @return the total price of pizza
     */
    @Override
    public double getTotalPrice() {
        double sumPrice = 0.0;
        for (Toppings top : this.toppingsList) {
            sumPrice += top.getTotalPrice();
        }
        return sumPrice + this.basePrice;
    }

    /**
     * add a topping onto pizza
     * @param top to be added topping
     */
    public void addToppings (Toppings top) {
        this.toppingsList.add(top);
    }

    /**
     * remove the first identical topping
     * @param top the topping that wants to be deleted
     */
    public void deleteToppings (Toppings top) {
        toppingsList.remove(top);
    }
}
