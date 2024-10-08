package Chap2_GenerateObjectAndDestory.item2.javabeans;

public class NutritionFacts {
    //매개변수들은 ( 기본값이 있다면 ) 기본값으로 초기화된다.
    private int servingSize; //(ml, 1회 제공량) 필수
    private int servings;//(회, 총 n회 제공량) 필수
    private int calories; //(1회 제공량) 선택
    private int fat; //(g/1회 제공량) 선택
    private int sodium; //(mg/1회 제공량) 선택
    private int carbohydrate; //(g/1회 제공량) 선택

    public NutritionFacts() { // 기본 ( default ) 생성자
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
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
    public static void main(String[] args) {
        //방법2. 자바빈즈패턴을 이용한 setter 사용 | 단점 : 일관성 문제
        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setServingSize(240);
        nutritionFacts.setServings(8);
        nutritionFacts.setCalories(100);
        nutritionFacts.setSodium(35);
        nutritionFacts.setCarbohydrate(27);
    }
}
