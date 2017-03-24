package ch15.ex20.include;

/**
 * Created by V1 on 17.03.2017.
 */
public class Manipulator3<T extends HasF> {
    private T obj;
    public Manipulator3(T obj) {
        this.obj = obj;
    }
    public void manipulator() {
        obj.f();            //метод обнаружен
    }
    public  T getManupulator() {
        return obj;
    }
}
