package ch14.ex21.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {

    private static void consumer(IFace iFace) {
        iFace.doSome();
        iFace.someElse("data");
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nDynamic Proxy Check\n");

        RealObject r = new RealObject();
        StdProxy p = new StdProxy(r);
        consumer(r);    // выполнение методов объекта напрямую
        consumer(p);    // выаполнение методов объекта за прокси


    }
}
