package item._2.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NutritionFactsTest {

    @Test
    void test() {
        final NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .fat(8)
                .build();

        assertEquals(240, nutritionFacts.getServingSize());
        assertEquals(8, nutritionFacts.getServings());
        assertEquals(100, nutritionFacts.getCalories());
        assertEquals(35, nutritionFacts.getSodium());
        assertEquals(8, nutritionFacts.getFat());
        assertEquals(27, nutritionFacts.getCarbohydrate());
    }

}
