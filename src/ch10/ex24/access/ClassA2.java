package ch.ex24.access;

/**
 * Created by V1 on 16-Feb-17.
 */
public class ClassA2 {
    public InterfaceU getU() {

        return new InterfaceU() {
            @Override
            public void init() {
                System.out.println("ClassA2.init");
            }

            @Override
            public void play() {
                System.out.println("ClassA2.play");
            }

            @Override
            public void status() {
                System.out.println("ClassA2.status");
            }
        };
    }
}
