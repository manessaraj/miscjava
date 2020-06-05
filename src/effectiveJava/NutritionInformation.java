package effectiveJava;

public class NutritionInformation {

    /*
    *  Problem with this code is that there is long list of parameters to remember while invoking constructor and they all
    *  are of same type hence prone to bugs where we mistakenly pass the wrong parameter to wrong field. This error happened
    * once with Preview object creation and I had entire bug which needed line level decoding to figure out real cause, which
    * was wrong sequence of parameter passing,
    *
    **/



    /* Ideally all of the following fields has to be final, as their value should not change
    * But I telescoped all constructors in reverse direction, hence had to remove final keyword, because otherwise some
    * of the fields remains uninitialized.
    * */
    private String name;
    private int servingSize;
    private int servings;
    private int fat;
    private final int sodium;
    private final int carbohydrate;

    /* Below pattern of constructors is called Telescoping Constructors*/
    /* This is bad, not scalable with variable number of arguments */
    public NutritionInformation(int sodium, int carbohydrate) {
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public NutritionInformation(int fat, int sodium, int carbohydrate) {
        this(sodium, carbohydrate);
        this.fat = fat;
    }

    public NutritionInformation(int servings, int fat, int sodium, int carbohydrate) {
        this(fat, sodium, carbohydrate);
        this.servings = servings;
    }

    public NutritionInformation(int servingSize, int servings, int fat, int sodium, int carbohydrate) {
        this(servings, fat, sodium, carbohydrate);
        this.servingSize = servingSize;
    }

    public NutritionInformation(String name, int servingSize, int servings, int fat, int sodium, int carbohydrate) {
        this(servingSize, servings, fat, sodium, carbohydrate);
        this.name = name;
    }
}
