package Chap2_GenerateObjectAndDestory.item1.foo;

public class Foo {
    String name;

    String address;

    public Foo() {
    }

    private static final Foo GOOD_NIGHT = new Foo();

    public Foo(String name) {
        this.name = name;
    }

//    public Foo(String address) { // 같은 타입의 매개변수를 받을 수 없다
//        this.address = address;
//    }

    public static Foo withName(String name) {
        return new Foo(name);
    }

    public static Foo withAddress(String address) {
        Foo foo = new Foo();
        foo.address = address;
        return foo;
    }

    public static Foo getFoo() {
        return GOOD_NIGHT;
    }

    public static Foo getFoo(boolean flag) {
        return flag ? new Foo() : new BarFoo();
    }
}
