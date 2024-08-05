package Chap2_GenerateObjectAndDestory.item2.telescopingconstructor;

public class NutritionFacts {
    private final int servingSize; //(ml, 1회 제공량) 필수
    private final int servings;//(회, 총 n회 제공량) 필수
    private final int calories; //(1회 제공량) 선택
    private final int fat; //(g/1회 제공량) 선택
    private final int sodium; //(mg/1회 제공량) 선택
    private final int carbohydrate; //(g/1회 제공량) 선택

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }
    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }
    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    //모든 매개변수를 받는 생성자
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        //방법1. 점층적 생성자 패턴 (telescoping constructor pattern 사용 | 단점 : 생성자를 사용하면 해당 파라미터값들이 무슨값에 해당하는지 알기 어렵다.
        NutritionFacts nutritionFacts = new NutritionFacts(240, 8, 100, 0, 35, 27);
    }
}
