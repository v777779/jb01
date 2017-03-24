package ch14.ex11.integra;

import java.util.List;


/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nClass<T> Check\n");

        FilledList<CountInteger> fl = new FilledList<>(CountInteger.class); // тип и объект класса
        List<CountInteger> arrayList = fl.create(12);
        System.out.println(arrayList);
    }
}
