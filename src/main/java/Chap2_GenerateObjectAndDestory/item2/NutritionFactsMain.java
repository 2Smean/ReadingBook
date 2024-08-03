package Chap2_GenerateObjectAndDestory.item2;

public class NutritionFactsMain {

    public static void main(String[] args) {
        //방법1. 생성자 사용 | 단점 : 생성자를 사용하면 해당 파라미터값들이 무슨값에 해당하는지 알기 어렵다.
        NutritionFacts nutritionFacts = new NutritionFacts(1, 6, 10, 20);

        //방법2. 자바빈즈패턴을 이용한 setter 사용 | 단점 :
    }
}
