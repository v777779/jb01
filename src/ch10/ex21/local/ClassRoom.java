package ch10.ex21.local;

/**
 * Created by V1 on 16-Feb-17.
 */
public class ClassRoom implements IClassInterface {
    public ClassRoom() {
    }
    @Override
    public void howdo() {
        System.out.println("ClassRoom.howdo");
    }

    public void show() {
        System.out.println("ClassRoom.***show***");
    }

    public Test getTest(String s) {
        return new Test(s);
    }

    public Test2 getTest() {
        return new Test2();
    }

}
