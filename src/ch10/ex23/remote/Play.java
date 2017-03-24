package ch10.ex23.remote;
import ch10.ex23.integra.*;


/**
 * Created by V1 on 16-Feb-17.
 */
public class Play {
    public static void playA(InterfaceA a) {
        a.initA();
        a.playA();
    }
    public static void playB(InterfaceB b) {
        b.initB();
        b.playB();
    }
    public static void playD(ClassD d) {
        d.show();
    }

    public static void playE(ClassE e) {
        e.show();
    }
}
