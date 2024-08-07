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

}
