package Chap2_GenerateObjectAndDestory.item8.study.autocloseable;

public class SampleRunner {

    public static void main(String[] args) throws InterruptedException {
        //이상적인 자원 반납 AutoCloseable
        try(SampleResource sampleResource = new SampleResource()) { //암묵적 close
            sampleResource.hello();
        }
    }

}
