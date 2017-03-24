package ch15.ex25.integra;

import ch15.ex25.include.GenericArray;
import ch15.ex25.include.GenericArray2;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nGeneric Array w Class Token Check\n");
        try {
            GenericArray<Integer> ga = new GenericArray<>(10);
            Integer[] pa = ga.rep();

        }catch (Exception e) {
            System.out.println("GenericArray rep() : fail");
        }

        try {
            GenericArray2<Integer> ga2 = new GenericArray2<>(10);
            Integer[] pa2 = (Integer[])ga2.rep();
        } catch (Exception e) {
            System.out.println("GenericArray2 rep(): fail");
        }

        GenArrayToken<Integer> gt = new GenArrayToken<>(Integer.class,10);
        Integer[] pt = gt.rep();
        System.out.println("GenArrayToken rep(): done");

    }
}
