package ch14.ex22.access;

import java.lang.reflect.Proxy;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void consumer(IFace iFace) {
        iFace.doSome();
        iFace.someElse("data");
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 22 Dynamic Proxy  Check\n");
        IFace r = new RealObject();

        IFace iFace = (IFace) Proxy.newProxyInstance(
                IFace.class.getClassLoader(),
                new Class[]{IFace.class},
                new DmProxy(r)
        );

        consumer(r);
        consumer(iFace);
    }
}
