package ch.ex26.access;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Terminate extends Event {
    GreenHouse gc;
    public Terminate(long delayTime, GreenHouse gc) {
        super(delayTime);
        this.gc = gc;
    }

    @Override
    public void action() {
        gc.requestForExit();    // запрос на выход
//        System.exit(0);       // жесткий выход без продолжения
    }

    @Override
    public String toString() {
        return "Terminate{}";
    }
}
