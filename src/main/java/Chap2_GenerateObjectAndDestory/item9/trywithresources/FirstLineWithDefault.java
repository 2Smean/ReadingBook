package Chap2_GenerateObjectAndDestory.item9.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//p.49
public class FirstLineWithDefault {
    //코드 9-5 try-with-resources 를 catch 절과 함께 쓰는 모습
    static String firstLineOfFile(String path, String defaultVal) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

    public static void main(String[] args) {
        String path = args[0];
        System.out.println(firstLineOfFile(path,"smile"));
    }
}
