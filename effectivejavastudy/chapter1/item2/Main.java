package effectivejavastudy.chapter1.item2;

public class Main {

    public static void main(String[] args) {
        NutritionFactsWithTeleScopingConstructor a = new NutritionFactsWithTeleScopingConstructor(240, 8, 100, 0, 35, 27);

        NutritionFactsWithJavaBeans b = new NutritionFactsWithJavaBeans();
        b.setServingSize(240);
        b.setServings(8);
        b.setCalories(100);
        b.setSodium(35);
        b.setCarbohydrate(27);

        NutritionFactsWithBuilder c = new NutritionFactsWithBuilder.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}
