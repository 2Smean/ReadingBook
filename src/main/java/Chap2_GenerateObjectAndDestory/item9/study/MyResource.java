package Chap2_GenerateObjectAndDestory.item9.study;

public class MyResource implements AutoCloseable {

    public void doSomething() {
        System.out.println("do something");
        throw new FirstError();
    }
    @Override
    public void close() {
        System.out.println("close my resource");
        throw new SecondError();
    }
}
