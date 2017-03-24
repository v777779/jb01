package ch.ex26.include;

import lib.fruits.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nList WildCard Check\n");
//        List<Fruit> fruits = new ArrayList<Apple>();          // не компилируется
        List<? extends Fruit> flist = new ArrayList<Apple>();   // компилируется
//        flist.add(new Apple());   // не компилируется
//        flist.add(new Orange());  // не компилируется
//        flist.add(new Fruit());   // не компилируется

    }
}
