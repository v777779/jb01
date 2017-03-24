package ch.ex14.local;

import lib.utils.IGenerator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nBasic Generic IGenerator Check\n");
        IGenerator<MClass> genC = GenBasic.create(MClass.class);

        for (int i = 0; i <10 ; i++) {
            System.out.print(genC.next()+" ");
        }
        System.out.println();

        IGenerator<MClass2> genD = GenBasic.create(MClass2.class);

        for (int i = 0; i <10 ; i++) {
            System.out.print(genD.next()+" ");
        }
        System.out.println();


    }
}
