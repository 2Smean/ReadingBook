package Chap2_GenerateObjectAndDestory.item3.field;
//public static final 필드 방식의 싱글턴
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();
    private Elvis() { }

    public void leaveTheBuilding() { }

    //main 메서드는 클래스 밖에 정의해야한다. (편의상 같은 클래스에 작성)
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}









