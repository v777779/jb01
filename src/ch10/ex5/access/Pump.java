package ch.ex5.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Pump {
    private Gasolin.Oil oil = (new Gasolin()).new Oil();  // сразу создали оба экземпляра

    public Pump() {
        System.out.println("Pump.Constructor");
    }

    public void show() {
        oil.show();
    }
}
