package Chap2_GenerateObjectAndDestory.item3.study;

import java.io.Serializable;

public class Singleton2 implements Serializable {

    private static final transient Singleton2 INSTANCE = new Singleton2();
    private Singleton2() {

    }
    public static Singleton2 getInstance() {
        return INSTANCE;
    }

}
