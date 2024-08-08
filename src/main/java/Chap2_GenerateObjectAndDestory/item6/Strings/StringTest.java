package Chap2_GenerateObjectAndDestory.item6.Strings;

public class StringTest {
    //Heap 영역
    //String constant pool(perm 영역) -> Heap 영역
    public static void main(String[] args) {

        String s = new String("bikini"); //따라 하지 말 것!
        String s1 = new String("bikini");

        String s3 = "bikini"; //옳게 사용된 모습

        System.out.println(s == s1); //answer : false ( == 는 주소값을 비교하는 것이기에 false 가 나온다)
        System.out.println(s.equals(s1));//answer : true

        //Boolean 예제
        Boolean true1 = Boolean.valueOf("true");
        Boolean true2 = Boolean.valueOf("true");

        System.out.println(true1 == true2);
        System.out.println(Boolean.TRUE == true1);
    }
}
