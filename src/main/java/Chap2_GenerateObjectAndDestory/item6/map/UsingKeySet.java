package Chap2_GenerateObjectAndDestory.item6.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsingKeySet {
    // p.33 반환한 객체 중 하나를 수정하면 다른 모든 객체가 따라서 바뀐다
    //모두가 똑같은 Map 인스턴스를 대변하기 때문이다
    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Burger", 80);
        menu.put("Pizza", 0);

        Set<String> names1 = menu.keySet();
        Set<String> names2 = menu.keySet();

        names1.remove("Burger");//names1 의 Key 값 삭제
        System.out.println(names2.size()); // answer : 1
        System.out.println(menu.size()); // answer : 1
    }
}
