package ch15.ex20.include;

/**
 * Created by V1 on 17.03.2017.
 */
public class Manipulator<T> {
    T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }
    public void manipulator() {
//        obj.f()  // компилятор метод не находит
    }
}
