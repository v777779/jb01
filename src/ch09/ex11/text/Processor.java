package ch09.ex11.text;

/**
 * Created by V1 on 13-Feb-17.
 */
abstract public class Processor {
    abstract public Object getData();

    public String name() {
        return getClass().getSimpleName(); // get simple Name of Class
    }

    public Object process(Object object) {  // фиктивный метод в базовом классе использует ковариантность выхода
        System.out.println("P.process");
        return object;
    }
}
