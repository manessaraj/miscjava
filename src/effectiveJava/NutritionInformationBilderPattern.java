package effectiveJava;

public class NutritionInformationBilderPattern {

    /*
     * Problem: Same as @see effectiveJava.NutritionInformation, where we have 2 required fields and rest of them are optional
     * */

    /*
    * Here we gonna combine the approaches of JavaBean way + Constructor Telescoping, i.e. Resulting into Builder Pattern.
    * */

    private final String name;
    private final int servingSize;
    private final int servings;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        /* Parameter validity is part of builder as well */


        // Required Parameters
        private final int servingSize;
        private final int servings;

        //Optional Args
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;
        private String name;
        public Builder(int servingSize, int servings) {
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public NutritionInformationBilderPattern build() {
            return new NutritionInformationBilderPattern(this);
        }
    }

    /*Pay attention that even though properties of builder are private, we are accessing them without getters
    * This is because internal access-scope of Builder is still resolved at Nutritional class level (i.e Parent class)
    * But overloading the names of variables is limited by {}. hence there is no clash.
    * */
    private NutritionInformationBilderPattern(Builder builder) {
        this.carbohydrate = builder.carbohydrate;
        this.fat = builder.fat;
        this.name = builder.name;
        this.servings = builder.servings;
        this.servingSize = builder.servingSize;
        this.sodium = builder.sodium;
    }
}
