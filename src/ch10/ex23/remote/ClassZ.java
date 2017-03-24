package ch10.ex23.remote;

/**
 * Created by V1 on 16-Feb-17.
 */
public class ClassZ {           // интерфейсы A,B
    public InterfaceA getA() {   // анонимный класс  interface A
        return new InterfaceA() {
            public void initA() { }
            public void playA() { }
        };
    }
    public InterfaceB getB() { // анонимный класс  interface B
        return new InterfaceB() {
            public void initB() { }
            public void playB() { }
        };
    }

}
