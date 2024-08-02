package Chap2_GenerateObjectAndDestory.item1.foo;


import java.util.EnumSet;

import static Chap2_GenerateObjectAndDestory.item1.foo.Color.*;

public class FooMain {

    public static void main(String[] args) {
        Foo foo = new Foo("lsm");// 생성자 | name 이 뭘 뜻하는지 알기가 어렵다.

        Foo foo1 = Foo.withName("lsm");//정적 팩터리 메서드 | 잘 만들어진 static 팩토리를 사용하면 읽기 쉽다.

        Foo foo2 = Foo.getFoo();//new 로 새로운 Foo 객체가 생성되는것이 아닌 GOOD_NIGHT이라는 Foo 객체가 return 된다.

        Foo foo3 = Foo.getFoo(false);//리턴하는 객체의 클래스가 입력매개 변수에 따라 다를 수 있다.

        EnumSet<Color> colors = EnumSet.allOf(Color.class);

        EnumSet<Color> blueAndWhite = EnumSet.of(BLUE, WHITE);
    }
}
