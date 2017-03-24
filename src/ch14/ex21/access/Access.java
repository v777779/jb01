package ch14.ex21.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void consume(IFace iFace) {
        iFace.doSome();
        iFace.someElse("data");
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 21 Standard Proxy Check\n");
        RealObject r = new RealObject();
        StdProxy p = new StdProxy(r);
        consume(r);
        consume(p);

    }
}
