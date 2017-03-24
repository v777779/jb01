package ch.ex20.include;

/**
 * Created by V1 on 17.03.2017.
 */
public class Manipulator2<T extends HasF> {
    T obj;
    public Manipulator2(T obj) {
        this.obj = obj;
    }
    public void manipulator() {
        obj.f();            //метод обнаружен
    }
}
