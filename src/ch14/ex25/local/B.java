package ch14.ex25.local;

/**
 * Created by V1 on 13-Mar-17.
 */
public class B implements A {

    @Override
    public void f() {
        System.out.println("B.f");
    }
    public void g() {
        System.out.println("B.g");
    }
}
