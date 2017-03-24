package ch14.ex21.integra;

/**
 * Created by V1 on 12-Mar-17.
 */
public class RealObject implements IMethods {
    @Override
    public void boring1() {
        System.out.println("RealObject.boring1");
    }

    @Override
    public void boring2() {
        System.out.println("RealObject.boring2");
    }

    @Override
    public void interesting(String s) {
        System.out.println("RealObject.interesting."+s);
    }

    @Override
    public void boring4() {
        System.out.println("RealObject.boring4");
    }
}
