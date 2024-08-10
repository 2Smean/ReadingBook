package Chap2_GenerateObjectAndDestory.item8.study.autocloseable;

public class SampleResource implements AutoCloseable{

    private boolean closed;

    @Override
    public void close() throws RuntimeException {
        if (this.closed) {
            throw new IllegalStateException();
        }
        closed = true;
        System.out.println("close");
    }

    public void hello() {
        System.out.println("hello");
    }

    @Override
    protected void finalize() throws Throwable {//finalize 를 이용한 안전망
        if (!this.closed) {
            close();
        }
    }
}
