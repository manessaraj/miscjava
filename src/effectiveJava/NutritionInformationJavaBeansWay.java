package effectiveJava;

public class NutritionInformationJavaBeansWay {

    /*
    * Problem: Same as @see effectiveJava.NutritionInformation, where we have 2 required fields and rest of them are optional
    * */


    /*
    * This is Java bean way of creating objects, where we first create minimal required object and then call all set
    * methods to set all other optional fields. But code will be lengthy and while all the calls being made to set the
    * remaining fields, object state will be inconsistent. Further class is mutable. See we have to remove final keywords
    * from all the fields. And this class is not thread safe (because of immutability loss).
    * */

    private String name;
    private int servingSize = -1; // to indicate that this is required field
    private int servings = -1;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public NutritionInformationJavaBeansWay(int servingSize, int servings) {
        this.servings = servings;
        this.servingSize = servingSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
