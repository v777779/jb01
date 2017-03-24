package ch06.ex4;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Widget Check");
        NTest nTest = new NTest();
        System.out.println(nTest.getProtected());
        System.out.println(nTest.getDefault());
        System.out.println(nTest.getPrivate());
        nTest.show();

    }
}
