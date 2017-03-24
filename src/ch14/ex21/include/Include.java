package ch14.ex21.include;

import java.lang.reflect.Proxy;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    private static void consumer(IFace iFace) {
        iFace.doSome();
        iFace.someElse("data");
    }

    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nDynamic Proxy Invocation Check\n");
        RealObject r = new RealObject();
        consumer(r);
//Insert Dynamic Proxy
        IFace proxy = (IFace) Proxy.newProxyInstance(  // стандартный класс Proxy
                IFace.class.getClassLoader(),
                new Class[]{IFace.class}, new DynProxy(r) // DynProxy обязан реализовать InvocationHandler
        );
        System.out.println("Proxy:");
        consumer(proxy);

    }
}
