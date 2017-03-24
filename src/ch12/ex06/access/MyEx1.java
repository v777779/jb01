package ch12.ex06.access;

/**
 * Created by V1 on 01-Mar-17.
 */
public class MyEx1 extends Exception {
    public MyEx1() {
    }

    public MyEx1(String message) {
        super(message);
    }

//    @Override
//    public String toString() {
//        return getClass().getSimpleName();
//    }
}
