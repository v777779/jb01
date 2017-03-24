package ch12.ex25.access;

/**
 * Created by V1 on 03-Mar-17.
 */
public class ClassB extends ClassA {
    @Override
    protected void getValue() throws GameEx {
//        super.getValue();
        throw new GameEx();
    }
}
