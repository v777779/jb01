package ch14.ex21.integra;

import java.lang.reflect.Proxy;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nDynamic Handler Check\n");
        IMethods im = (IMethods) Proxy.newProxyInstance(
                IMethods.class.getClassLoader(),   // загрузчик класса
                new Class []{ IMethods.class },    // класс конструктор
                new MSelect(new RealObject())      // обработчик и объект
        );

        im.boring1();
        im.boring2();
        im.interesting("string");
        im.boring4();

    }
}
