package ch15.ex21.local;

/**
 * Created by V1 on 17.03.2017.
 */
public class Foo<T> {
    T var;

    public Foo(T var) {
        this.var = var;
    }

    public String getInfo() {
        return var.getClass().getSimpleName();
    }
}
