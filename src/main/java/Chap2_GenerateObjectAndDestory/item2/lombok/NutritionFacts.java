package Chap2_GenerateObjectAndDestory.item2.lombok;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public class NutritionFacts {
    @Builder.Default
    private int servingSize = 10;
    private int sodium;
    private int carbohydrate;
    private int servings;
    @Singular // 기존의 setter 역할같이 add 가능하다.
    private List<String> names;

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = NutritionFacts.builder()
                .servings(10)
                .name("lsm") // @Singular
                .name("aws") // @Singular
                .build();
    }
}

