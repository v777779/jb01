package ch12.ex25.access;

/**
 * Created by V1 on 03-Mar-17.
 */
public class ClassA {
    protected void getValue() throws PlaceEx {
        throw new PlaceEx();
    }
}
