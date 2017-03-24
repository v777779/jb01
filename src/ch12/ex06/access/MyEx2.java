package ch12.ex06.access;

/**
 * Created by V1 on 01-Mar-17.
 */
public class MyEx2 extends Exception {
    private int x;

    public MyEx2(int x) {
        this.x = x;
    }

    public MyEx2(String message, int x) {
        super(message);
        this.x = x;
    }


    @Override
    public String toString() {
        return "MyEx2{" + getMessage()+ ": x=" + x +
                '}';
    }
}
