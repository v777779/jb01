package ch15.ex21.remote;

/**
 * Created by V1 on 17.03.2017.
 */
public class ClassCapture<T> {  // класс захвата типа класса
    Class<T> kind;

    public ClassCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);  // <arg is instance of kind>
    }


}
