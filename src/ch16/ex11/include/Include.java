package ch16.ex11.include;

import lib.utils.IGenerator;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {

    public static void genTest(Class<?> type) {
        int size = 10; //  длина данных
        for (Class<?> aClass : type.getClasses()) { // получить внутренние классы
            System.out.printf("%-10s:",aClass.getSimpleName());
            try {
                IGenerator<?> gen = (IGenerator<?>)aClass.newInstance();  // создали объект с нужным типом
                for (int i = 0; i < size ; i++) {
                    System.out.print(gen.next()+" ");
                }
            } catch (Exception e) {
                System.out.println("can't instance class");
            }
            System.out.println();
        }

    }
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nIGenerator Data for Array Check\n");
        System.out.println("Test Generators of GenSeq.SubcClasses():");
        genTest(GenSeq.class);  // прокачать генераторы всех внутренних классов

        System.out.println("\nTest Generators of GenRnd.SubcClasses():");
        genTest(GenRnd.class);  // прокачать генераторы Random всех внутренних классов

    }
}
