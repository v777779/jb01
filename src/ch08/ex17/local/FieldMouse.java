package ch08.ex17.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class FieldMouse extends Mouse {
    public FieldMouse() {
        System.out.println("FieldMouse.Consturctor");
    }

    public Box getMaterial() {
        return new Box();
    }

}
