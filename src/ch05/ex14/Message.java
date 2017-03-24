package ch05.ex14;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Message {
    static String s1 = "message 1";
    static String s2;
    static {
        s2 = "message 2";
    }
    static void show() {
        System.out.println(s1);
        System.out.println(s2);


    }
}
