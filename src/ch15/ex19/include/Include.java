package ch15.ex19.include;

import ch15.ex19.include.store.Store;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nComplex Classes with Generic Check\n");
        Store store = new Store(14,5,10);
        System.out.println(store);


    }
}
