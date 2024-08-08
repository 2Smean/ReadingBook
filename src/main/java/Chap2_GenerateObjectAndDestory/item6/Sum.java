package Chap2_GenerateObjectAndDestory.item6;
//박싱된 기본 타입보다는 기본 타입을 사용하고, 의도치 않은 오토박싱이 숨어들지 않도록 주의하자(p.34)
public class Sum {
    //코드 6-3 끔찍이 느리다! 객체가 만들어지는 위치를 찾았는가?
    // 박싱된 기본 타입 Long을 사용하여 합계를 계산하는 메소드
    private static long sumWithLongObject() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    // 기본 타입 long을 사용하여 합계를 계산하는 메소드
    private static long sumWithPrimitiveLong() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Long 객체를 사용하는 메소드 실행 시간 측정
        long startTime = System.currentTimeMillis();
        sumWithLongObject();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with Long object: " + (endTime - startTime) / 1_000_000. + " ms.");//결과 : Time taken with Long object: 0.005237 ms.

        // 기본 타입 long을 사용하는 메소드 실행 시간 측정
        startTime = System.currentTimeMillis();
        sumWithPrimitiveLong();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with primitive long: " + (endTime - startTime) / 1_000_000. + " ms.");//결과 : Time taken with primitive long: 0.001104 ms.
    }
}
