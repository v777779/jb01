package ch11.ex10.access;

import ch11.ex10.rodent.Rodent;

import java.util.Iterator;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 10 Iterator  Check\n");

        Rodent[] rodentsArray = Rodent.array(10); // получили заполненный массив

        System.out.println("Array Version Check");
        for (Rodent rodent : rodentsArray) {
            System.out.print(rodent+" ");
        }
        System.out.println();

        System.out.println("\nIterator Version  Check");
        List<Rodent> rodents = Rodent.arrayList(7);
        Iterator<Rodent> it = rodents.iterator();

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        System.out.println();
//        System.out.println("\nMethods of Array of Objects");
//        for (Rodent rodent : rodents) {
//            GenClass.voice(rodent);
//            GenClass.eat(rodent);
//            GenClass.sleep(rodent);
//            GenClass.run(rodent);
//            System.out.println();
//        }

    }
}
