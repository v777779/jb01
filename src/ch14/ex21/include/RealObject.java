package ch14.ex21.include;

/**
 * Created by V1 on 11-Mar-17.
 */
public class RealObject implements IFace {
    public void doSome() {
        System.out.println("RealObject.doSome");
    }

    public void someElse(String s) {
        System.out.println("RealObject.someElse."+s);
    }
}
