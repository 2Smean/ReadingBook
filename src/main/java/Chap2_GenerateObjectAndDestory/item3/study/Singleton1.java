package Chap2_GenerateObjectAndDestory.item3.study;

public class Singleton1 {

    public static final Singleton1 INSTANCE = new Singleton1();
    int count;
    private Singleton1() { //생성자 안에서 카운팅하여 싱글톤임을 확인
        count++;
        if (count != 1) {
            throw new IllegalStateException("this object should be singleton");
        }
    }
}
