package ch15.ex34.include;

import java.lang.reflect.Method;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void getInfo(Class<?> type) {
        System.out.println(type.getSimpleName()+" info:");
        for (Class<?> aClass : type.getInterfaces()) {
            System.out.print(aClass.getSimpleName()+" > ");
            for (Method method : aClass.getDeclaredMethods()) {
                System.out.print(method.getName()+"()");
            };
            System.out.println();
        }


    }

    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nInterface and Generic Check\n");
        Pet2 pet2 = new Pet2();
        Cat2 cat2 = new Cat2();
        Hamster2 hamster2 = new Hamster2();

       getInfo(pet2.getClass());
        getInfo(cat2.getClass());
        getInfo(hamster2.getClass());

    }
}
