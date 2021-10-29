package takeaway;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertFalse;
import java.util.HashMap;

import org.junit.Test;

public class MenuTest {
  @Test
    public void testHasListOfDishesAndPrices() {
      HashMap<String, Double> dishes = new HashMap<>();
      dishes.put("Pepperoni", 8.99);
      dishes.put("Veggie", 8.99);
      dishes.put("Hawaiian", 9.99);
      dishes.put("BBQ Chicken", 10.99);
      assertFalse(dishes.isEmpty());
      assertThat(dishes,hasKey("Pepperoni"));
    }

  @Test
    public void testShowsListOfDishesAndPrices() {
      HashMap<String, Double> dishes = new HashMap<>();
      dishes.put("Pepperoni", 8.99);
      dishes.put("Veggie", 8.99);
      dishes.put("Hawaiian", 9.99);
      dishes.put("BBQ Chicken", 10.99);
      assertThat(dishes, aMapWithSize(4));
    }
}