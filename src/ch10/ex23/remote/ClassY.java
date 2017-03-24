package ch10.ex23.remote;

/**
 * Created by V1 on 16-Feb-17.
 */
public class ClassY implements InterfaceA {  // комбинированная реализация
    public void initA() {  // стандартная реализация  interface A
    }
    public void playA() {
    }
    public InterfaceB getB() { // анонимный класс interface B
        return new InterfaceB() {
            public void initB() {
            }
            public void playB() {
            }
        };
    }
}
