package ch14.ex23.access;

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
        System.out.println("\nExercise 23 Dynamic Proxy Check\n");
        IFace r = new RealObject();
         IFace proxy = (IFace)Proxy.newProxyInstance(
                 IFace.class.getClassLoader(),
                 new Class[]{IFace.class},
                 new DmProxy(r)
         );
         System.out.println("proxyMain > "+proxy.toString());
        System.out.println("proxyMain >: "+ proxy.show());
         consumer(proxy);

    }
}
