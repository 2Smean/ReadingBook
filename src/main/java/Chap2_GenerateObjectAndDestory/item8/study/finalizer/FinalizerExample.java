package Chap2_GenerateObjectAndDestory.item8.study.finalizer;

public class FinalizerExample {

    @Override
    protected final void finalize() throws Throwable {
        System.out.println("Clean up");
    }

    public void hello() {
        System.out.println("hi");
    }
}
