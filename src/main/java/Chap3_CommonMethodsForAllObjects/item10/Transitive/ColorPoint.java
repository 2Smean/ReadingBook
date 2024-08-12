package Chap3_CommonMethodsForAllObjects.item10.Transitive;

import Chap3_CommonMethodsForAllObjects.item10.Color;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // 나머지 코드는 생략
}
