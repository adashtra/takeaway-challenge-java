package takeaway;

import java.util.ArrayList;

public class Order {
  ArrayList<String> basket = new ArrayList<String>();
  Menu menu;

  public Order(Menu menu) {
    this.menu = menu;
  }

  // Adds an available dish to basket
  public String add(String dish) {
    if (menu.getDishes().containsKey(dish)) {
      basket.add(dish);
      return "Dish added to basket";
    } else {
      return "Dish not on our menu, please try again";
    }
  }

  // Calculates the total cost of basket
  public Double calculateTotal() {
    Double cost = 0.0;
    for (String item : basket) {
      if (menu.getDishes().containsKey(item)) {
        cost += menu.getDishes().get(item);
      }
    }
    return cost;
  }

  public static void main(String[] args) {
    Menu menu = new Menu();
    Order order = new Order(menu);
    System.out.println(order.add("Veggie"));
    System.out.println(order.add("BBQ Chicken"));
    System.out.println(order.calculateTotal());
  }
}