package ch07.ex12.shelf;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Component1 {
    public Component1(int i) {
        System.out.println("Component1.Constructor int i = "+i);
    }

    void dispose() {
        System.out.println("Component1.dispose");
    }
}
