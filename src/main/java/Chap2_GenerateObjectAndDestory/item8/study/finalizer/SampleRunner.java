package Chap2_GenerateObjectAndDestory.item8.study.finalizer;

public class SampleRunner {

    public static void main(String[] args) throws InterruptedException {
        SampleRunner runner = new SampleRunner();
        runner.run();
        //System.gc(); 호출한다고 보장이 되는것이 아니다.
        Thread.sleep(1000l);

    }

    private void run() {
        FinalizerExample finalizerExample = new FinalizerExample();
        finalizerExample.hello();
    }
}
