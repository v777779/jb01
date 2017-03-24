package ch10.ex27.local;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Runner extends Track.Surface {  // компилируется если создать объект Tracк
    public Runner() {
       new Track().super();   // создаем экземпляр ExtClass.super() и его конструктор
        System.out.println("Runner.Constructor");
    }

    void init() {
        super.init();
        System.out.println("Runner.init");

    }
}
