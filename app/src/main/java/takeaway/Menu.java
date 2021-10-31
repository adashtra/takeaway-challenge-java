package takeaway;

import java.util.HashMap;

public class Menu {

  // Fields/attributes
  public HashMap<String, Double> dishes = new HashMap<String, Double>();

  // Constructor
  public Menu() {
    dishes.put("Pepperoni", 8.99);
    dishes.put("Veggie", 8.99);
    dishes.put("Hawaiian", 9.99);
    dishes.put("BBQ Chicken", 10.99);
  }

  // Prints menu
  public void print() {
    for (String i : dishes.keySet()) {
      System.out.println(i + ": £" + dishes.get(i));
    }
  }

  // Returns dishes hash
  public HashMap<String, Double> getDishes() {
    return dishes;
  }

  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.print();
  }
}