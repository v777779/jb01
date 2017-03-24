package ch.ex21.integra;

import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nGeneric Check\n");
        System.out.println("ArrayMaker Class:");
        ArrayMaker<String> arrayMaker = new ArrayMaker<>(String.class);
        String[] sArray = arrayMaker.create(10);
        System.out.println(Arrays.toString(sArray));

        System.out.println("\nListMaker Class:");
        ListMaker<String> listMaker = new ListMaker<>();
        List<String> sList = listMaker.create();
        System.out.println(sList);

        System.out.println("\nFilledListMaker Class:");
        FilledListMaker<String> flistMaker = new FilledListMaker<>();
        List<String> fList = flistMaker.create("Hello", 5);
        System.out.println(fList);

    }
}
