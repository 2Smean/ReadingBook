package Chap2_GenerateObjectAndDestory.item4.study;

public abstract class UtilClass {
    public static class AnotherClass extends UtilClass { }
    public static String getName() {
        return "lsm";
    }
    public static void main(String[] args) {
        //UtilClass utilClass = new UtilClass(); //객체 생성을 막기 위해 1차적으로 UtilClass에 abstract를 명시해준다
        AnotherClass anotherClass = new AnotherClass(); //의미없는 인스턴스가 만들어진다

    }
}
