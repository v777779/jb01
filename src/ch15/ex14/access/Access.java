package ch15.ex14.access;

import lib.utils.IGenerator;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 14 Basic Generic IGenerator Check\n");

        IGenerator<MClass> genC = GenBasic.create(MClass.class);  // через статический метод который не нужен
        for (int i = 0; i <10 ; i++) {
            System.out.print(genC.next()+" ");
        }
        System.out.println();

        IGenerator<MClass2> genD = new GenBasic(MClass.class);  // создание объекта напрямую
        for (int i = 0; i <10 ; i++) {
            System.out.print(genC.next()+" ");
        }
        System.out.println();


    }
}
