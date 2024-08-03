package Chap2_GenerateObjectAndDestory.item2;

import java.util.EnumSet;
import java.util.Objects;

public abstract class Pizza {

    public enum Topping {
        HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
    }

    final EnumSet<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        //하위 클래스는 이 메서드를 재정의(overriding) 하여
        //"this"를 반환하도록 해야한다.
        protected abstract T self(); //java 에는 self 가 없기에 java-script의 self 를 모방한 코드
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
