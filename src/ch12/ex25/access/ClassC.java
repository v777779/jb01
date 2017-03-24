package ch12.ex25.access;

/**
 * Created by V1 on 03-Mar-17.
 */
public class ClassC extends ClassB {
    @Override
    protected void getValue() throws GameEx {
//        super.getValue();
        throw new BallEx();

    }
}
