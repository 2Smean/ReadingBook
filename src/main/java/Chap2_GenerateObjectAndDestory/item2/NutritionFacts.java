package Chap2_GenerateObjectAndDestory.item2;

public class NutritionFacts {
    private int servingSize;
    private int sodium;
    private int carbohydrate;
    private int servings;

    public NutritionFacts() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public NutritionFacts(int servingSize, int sodium, int carbohydrate, int servings) {
        this.servingSize = servingSize;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
        this.servings = servings;
    }
}
