package Chap2_GenerateObjectAndDestory.item3.study;

import java.util.function.Supplier;

public class SingleTest {
    public static void main(String[] args) throws NoSuchFieldException{
        Singleton1 singleton1 = Singleton1.INSTANCE;//public static final 필드 방식

        Singleton2 singleton2 = Singleton2.getInstance();//정적팩터리

        Supplier<Singleton2> s2supplier = Singleton2::getInstance; //Supplier<>

        String name = Singleton3.INSTANCE.getName(); //enum 방식
    }
}
