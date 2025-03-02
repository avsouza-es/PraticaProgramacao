import java.util.*;

public class StringTesteJava {
    public static void main(String[] args) {
        String s1 = "Hello World";

        System.out.println(s1);

        String s2 = "a";
        String s3 = "";

        int number = 1001;
        String numberStr = "abc";
        String info = numberStr + number;
        boolean b1 = true;
        String info1 = info + b1;
        System.out.println(info1);

        //************************************ */
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c);
        System.out.println((int)c);
        System.out.println(c + num + str);

        //************************************ */
        System.out.println("*     *");
        }
}