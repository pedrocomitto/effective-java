package item._2.builder;

public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // mandatory params
        private final int servingSize;
        private final int servings;

        // optional params
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(final int servingSize, final int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(final int calories) {
            this.calories = calories;

            return this;
        }

        public Builder fat(final int fat) {
            this.fat = fat;

            return this;
        }

        public Builder sodium(final int sodium) {
            this.sodium = sodium;

            return this;
        }

        public Builder carbohydrate(final int carbohydrate) {
            this.carbohydrate = carbohydrate;

            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }

    private NutritionFacts(final Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

}
