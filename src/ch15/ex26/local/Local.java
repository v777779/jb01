package ch15.ex26.local;

import lib.fruits.*;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nArray w WildCard Check\n");
        Fruit[] fruits = new Apple[10]; // восходяшее преобразование
                                        // пока это пустой массив
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new Apple();  // просто заполняем
        }

        fruits[5] = new Jonathan();  // восходящее работает
        fruits[7] = new Jonathan();  // восходящее работает

        try {
            fruits[3] = new Fruit();  // Runtime не сработает, массив заявлен как Apple not Fruit
        } catch (Exception e) {
            System.out.println("catch: Fruit not Apple");
        }

        try {
            fruits[3] = new Orange();  // Runtime не сработает, массив заявлен как Apple not Orange
        } catch (Exception e) {
            System.out.println("catch: Orange not Apple");
        }

        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }



    }
}
