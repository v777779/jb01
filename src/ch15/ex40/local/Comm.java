package ch.ex40.local;

/**
 * Created by V1 on 22.03.2017.
 */
public class Comm {
    public static <T extends IPerform> void performGeneric(T p) {
        p.speak();
        p.sit();
    }

    public static void performType(IPerform p) {
        p.speak();
        p.sit();
    }

}
