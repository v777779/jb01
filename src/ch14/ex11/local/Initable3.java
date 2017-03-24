package ch14.ex11.local;

/**
 * Created by V1 on 09-Mar-17.
 */
public class Initable3 {
    static int staticNonFinal= 21;

    static {
        System.out.println("Load Initable3");
    }
}
