package ch14.ex23.access;

/**
 * Created by V1 on 12-Mar-17.
 */
public class RealObject implements IFace {
    @Override
    public String show() {
        return "RealObject.show";
    }

    @Override
    public void doSome() {
        System.out.println("RealObject.doSome");
    }

    @Override
    public void someElse(String s) {
        System.out.println("RealObject.someElse : "+s);
    }
}
