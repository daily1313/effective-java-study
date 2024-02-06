package effectivejavastudy.chapter1.item2;

public class NutritionFactsWithBuilder {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {

        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(final int servingSize, final int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(final int value) {
            calories = value;
            return this;
        }

        public Builder fat(final int value) {
            fat = value;
            return this;
        }

        public Builder sodium(final int value) {
            sodium = value;
            return this;
        }

        public Builder carbohydrate(final int value) {
            carbohydrate = value;
            return this;
        }

        public NutritionFactsWithBuilder build() {
            return new NutritionFactsWithBuilder(this);
        }
    }

    private NutritionFactsWithBuilder(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}
