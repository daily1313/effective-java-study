package effectivejavastudy.chapter1.item2;

public class NutritionFactsWithJavaBeans {

    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFactsWithJavaBeans() {
    }

    public void setServingSize(final int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(final int servings) {
        this.servings = servings;
    }

    public void setCalories(final int calories) {
        this.calories = calories;
    }

    public void setFat(final int fat) {
        this.fat = fat;
    }

    public void setSodium(final int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(final int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
