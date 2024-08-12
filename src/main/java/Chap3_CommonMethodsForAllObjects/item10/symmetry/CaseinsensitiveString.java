package Chap3_CommonMethodsForAllObjects.item10.symmetry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
// 코드 10-1 잘못된 코드 - 대칭성 위배! (54p ~ 55p)
public final class CaseinsensitiveString {
    private final String s;

    public CaseinsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // 대칭성 위배!
    public boolean equals(Object o) {
        if (o instanceof CaseinsensitiveString) {
            return s.equalsIgnoreCase(
                    ((CaseinsensitiveString) o).s);
        }
        if (o instanceof String) { // 한 방향으로만 작동한다!
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }
    //나머지 코드는 생략

    // 문제 시연
    public static void main(String[] args) {
        CaseinsensitiveString cis = new CaseinsensitiveString("Polish");
        String s = "polish";

        System.out.println(cis.equals(s)); //true 반환
        System.out.println(s.equals(cis)); //false 반환

        List<CaseinsensitiveString> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(s)); //false 반환
    }
}
