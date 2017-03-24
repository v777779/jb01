package ch10.ex12.include;

/**
 * Created by V1 on 15-Feb-17.
 */
abstract public class Base {
    public Base(int value) {
        System.out.println("Base.Constructor."+value);
    }
    public abstract void f();  // пустой метод в базовом классе
}
