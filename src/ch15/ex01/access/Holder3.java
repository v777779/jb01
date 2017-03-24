package ch15.ex01.access;

/**
 * Created by V1 on 14-Mar-17.
 */
public class Holder3<T> {
    T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}
