package Chap2_GenerateObjectAndDestory.item3.staticfactory;
//정적 팩터리 방식의 싱글턴
public class Elvis {
    transient private static final Elvis INSTANCE = new Elvis();
    private Elvis() { }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() { }

    //싱글턴임을 보장해주는 readResolve 메서드
    private Object readResolve() {
        // '진짜' Elvis 를 반환하고, 가짜 Elvis는 가비지 컬렉터에 맡긴다.
        return INSTANCE;
    }

    //main 메서드는 클래스 밖에 정의해야한다. (편의상 같은 클래스에 작성)
    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }
}


