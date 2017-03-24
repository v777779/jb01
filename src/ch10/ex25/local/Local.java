package ch.ex25.local;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Local {
    public static void app() {

    CallOne c1 = new CallOne();
    CallTwo c2 = new CallTwo();
        MyIncrement.play(c2);    // используется наследование CallTwo
    Caller caller1 = new Caller(c1); // получить ссылку на c1
    Caller caller2 = new Caller(c2.getCallBack());  // получить ссылку на внутренний класс по интерфейсу
    Caller caller3 = new Caller(c2.getI());         // получить ссылкну на другой внутренний класс

        caller1.play();
        caller1.play();
        caller2.play();
        caller2.play();

        caller3.play();
        caller3.play();
    }

}
