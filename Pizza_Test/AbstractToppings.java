public abstract class AbstractToppings implements Toppings {
    /**
     * how may toppings
     */
    protected int number;
    /**
     * the price of a single topping
     */
    protected double singlePrice;


    /**
     * get the total price of this topping class
     * @return total price
     */
    @Override
    public double getTotalPrice() {
        return number * singlePrice;
    }

    /**
     * override equals method
     * @param o another object o
     * @return whether they are equals
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Toppings)) return false;
        AbstractToppings top = (AbstractToppings) o;
        return (top.getNumber() == this.number &&
                top.getSinglePrice() == this.singlePrice);
    }

    /**
     * override hashcode method
     * @return hashcode of this object
     */
    @Override
    public int hashCode() {
        return (int) (31 * this.number + this.singlePrice);
    }

    /**
     * get the number of this topping.
     * @return the number of this topping
     */
    @Override
    public int getNumber() {
        return this.number;
    }

    /**
     * get the single topping price
     * @return single topping price
     */
    @Override
    public double getSinglePrice() {
        return singlePrice;
    }
}
