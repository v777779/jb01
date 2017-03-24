package ch15.ex28.access;

import lib.pets.Cat;
import lib.pets.Rodent;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public  static <T> void getValue(Generic1<? super T> obj) {
        obj.setT( new Generic2<T>().get());  // все сработало
    }

    public static <T> T f2(Generic2<?extends T> obj) {  // возвращаем объект
        return obj.get();
    }


    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 28 Check\n");

        getValue(new Generic1<Rodent>());
        System.out.println(f2(new Generic2<Cat>()));

    }
}
