package Chap2_GenerateObjectAndDestory.item6;

import java.util.regex.Pattern;

// 주어진 문자열이 유효한 로마 숫자인지 확인하는 메서드 (p.32)
public class RomanNumberals {
    //코드 6-1 성능을 훨씬 더 끌어올릴 수 있다!
    static boolean isRomanNumeralBefore(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    //코드 6-2 값비싼 객체를 재사용해 성능을 개선한다.
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
    );
    static boolean isRomanNumeralAfter(String s) {
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        // 다양한 문자열을 테스트하기 위해 로마 숫자와 로마 숫자가 아닌 문자열을 포함한 배열 생성
        String[] testStrings = {
                "III", "IV", "IX", "LVIII", "MCMXCIV", "MMMMCMXCIV",
                "not a roman numeral", "123", "", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII"
        };

        int iterations = 10000;

        // isRomanNumeralBefore의 성능 측정
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            for (String s : testStrings) {
                isRomanNumeralBefore(s);
            }
        }
        long endTime = System.nanoTime();
        long durationBefore = endTime - startTime;
        System.out.println("isRomanNumeralBefore의 소요 시간: " + durationBefore / 1_000_000.0 + " ms"); //결과 : isRomanNumeralBefore의 소요 시간: 475.758833 ms

        // isRomanNumeralAfter의 성능 측정
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            for (String s : testStrings) {
                isRomanNumeralAfter(s);
            }
        }
        endTime = System.nanoTime();
        long durationAfter = endTime - startTime;
        System.out.println("isRomanNumeralAfter의 소요 시간: " + durationAfter / 1_000_000.0 + " ms"); //결과 : isRomanNumeralAfter의 소요 시간: 27.310667 ms
    }
}
