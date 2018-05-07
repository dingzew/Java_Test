import java.util.Map;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Pizza {
  public enum Topping {
    TUNA(2), OLIVES(0), PEPPERONI(1);
    private final int price;
    public int price() { return price; }
    Topping(int price) { this.price = price; }
  }

  public enum BasePizza {
    CHICAGO(8), NY(6);
    private final int price;
    public int price() { return price; }
    BasePizza(int price) { this.price = price; }
  }


  private final Map<Topping, Integer> toppings;
  private final BasePizza basePizza;
  public Pizza(Map<Topping, Integer> toppings, BasePizza basePizza) {
    this.toppings = new EnumMap<>(toppings);
    this.basePizza = basePizza;
  }
  public int price() {
    int price = basePizza.price();
    for (Map.Entry<Topping, Integer> entry : toppings.entrySet()) {
      Topping topping = entry.getKey();
      int quantity = entry.getValue();
      price += topping.price() * quantity;
    }
    return price;
  }
  @Override
  public String toString() {
    return String.format("%s with %s",
      basePizza,
      toppings.keySet()
              .stream()
              .map(Topping::toString)
              .collect(Collectors.joining(" ")));
  }

  public static void main(String[] args) {
    Map<Topping, Integer> toppingMap = new HashMap<>();
    toppingMap.put(Topping.TUNA, 1);
    toppingMap.put(Topping.PEPPERONI, 1);
    BasePizza base = BasePizza.CHICAGO;
    Pizza pizza = new Pizza(toppingMap, base);
    System.out.println(pizza.price());
  }

}