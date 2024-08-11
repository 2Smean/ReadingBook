package Chap2_GenerateObjectAndDestory.item9.study;

public class AppRunner {

    public static void main(String[] args) {
        try (MyResource myResource = new MyResource();
             MyResource myResource1 = new MyResource()) {//close를 명시적으로 호출하지 않아도 된다.
            myResource.doSomething();
            myResource1.doSomething();
        }
    }
}
