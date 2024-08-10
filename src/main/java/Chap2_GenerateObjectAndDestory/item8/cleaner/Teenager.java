package Chap2_GenerateObjectAndDestory.item8.cleaner;

public class Teenager {
    public static void main(String[] args) {
        new Room(99);
        System.out.println("아무렴");

        //System.gc()에 의존해서는 안된다.
        //System.gc();
    }
}
