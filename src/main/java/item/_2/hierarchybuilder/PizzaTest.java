package item._2.hierarchybuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PizzaTest {

    @Test
    void test() {
        final NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.PEPPER)
                .addTopping(Pizza.Topping.HAM)
                .build();

        assertEquals(NyPizza.Size.SMALL, nyPizza.getSize());
        assertTrue(nyPizza.toppings.contains(Pizza.Topping.PEPPER));
        assertTrue(nyPizza.toppings.contains(Pizza.Topping.HAM));

        System.out.println(nyPizza.toString());
    }

}
