package ch17.ex32.access;

import lib.generate.GenList;
import lib.tests.TestParam;
import lib.tests.Tester;

import java.util.List;

/**
 * Created by V1 on 02-Apr-17.
 */
public class TInt {
    public static void printHeader(String s) {
        System.out.print("size  : ");
        for (TestParam param : Tester.defaultParams) {
            System.out.printf("%-8d", param.size);
        }
        System.out.println();
        System.out.print(s);
    }

    public static void testList(List<Integer> list) {
        System.out.println(list.getClass().getSimpleName() + ":");
        printHeader("add   : ");

        for (TestParam param : Tester.defaultParams) {
            int loops = param.loops;
            int size = param.size;
            long start = 0;
            long duration = 0;
            for (int i = 0; i < param.loops; i++) {
                list.clear();
                start = System.nanoTime();
// полоса замера
                for (int j = 0; j < param.size; j++) {
                    list.add(j);
                }
// полоса замера
                duration += (System.nanoTime() - start);
            }
            duration = duration / (loops * size);
            System.out.printf("%-8d", duration);
        }
        System.out.println();
// remove
        System.out.print("remove: ");
        for (TestParam param : Tester.defaultParams) {
            int loops = param.loops;
            int size = param.size;
            long start = 0;
            long duration = 0;
            for (int i = 0; i < param.loops; i++) {
                list.clear();

                list.addAll(new GenList<Integer>(size));
                size = param.size;
                start = System.nanoTime();
// полоса замера
                for (int j = 0; j < size; j++) {
                    list.remove(0);
                }
// полоса замера
                duration += System.nanoTime() - start;
            }
            duration = duration / (loops * size);
            System.out.printf("%-8d", duration);
        }
        System.out.println();
// increment
        System.out.print("inc   : ");
        for (TestParam param : Tester.defaultParams) {
            int loops = param.loops;
            int size = param.size;
            long start = 0;
            long duration = 0;
            for (int i = 0; i < param.loops; i++) {
                list.clear();

                list.addAll(new GenList<Integer>(size));
                size = param.size;
                start = System.nanoTime();
// полоса замера
                for (int j = 0; j < size; j++) {
                    list.set(j,list.get(j)+1);
                }
// полоса замера
                duration += System.nanoTime() - start;
            }
            duration = duration / (loops * size);
            System.out.printf("%-8d", duration);
        }
        System.out.println();

    }

    public static void testArray(ContInt list) {
        System.out.println(list.getClass().getSimpleName() + ":");
        printHeader("add   : ");

        for (TestParam param : Tester.defaultParams) {
            int loops = param.loops;
            int size = param.size;
            long duration = 0;
            long start = 0;
            for (int i = 0; i < param.loops; i++) {
                list.clear();
                start = System.nanoTime();
// полоса замера
                for (int j = 0; j < param.size; j++) {
                    list.add(j);
                }
// полоса замера
                duration += (System.nanoTime() - start);
            }

            duration = duration / (loops * size);
            System.out.printf("%-8d", duration);
        }
        System.out.println();
//remove
        System.out.print("remove: ");
        for (TestParam param : Tester.defaultParams) {
            int loops = param.loops;
            int size = param.size;
            long start = 0;
            long duration = 0;
            for (int i = 0; i < param.loops; i++) {
                list.clear();
                list.addAll(new GenList<Integer>(size));
                size = param.size;
                start = System.nanoTime();
// полоса замера
                for (int j = 0; j < size; j++) {
                    list.remove();
                }
// полоса замера
                duration += System.nanoTime() - start;
            }
            duration = duration / (loops * size);
            System.out.printf("%-8d", duration);
        }
        System.out.println();

        //remove
        System.out.print("inc   : ");
        for (TestParam param : Tester.defaultParams) {
            int loops = param.loops;
            int size = param.size;
            long start = 0;
            long duration = 0;
            for (int i = 0; i < param.loops; i++) {
                list.clear();
                list.addAll(new GenList<Integer>(size));
                size = param.size;
                start = System.nanoTime();
// полоса замера
                for (int j = 0; j < size; j++) {
                    list.set(j,list.get(j)+1);  // инкремент
                }
// полоса замера
                duration += System.nanoTime() - start;
            }
            duration = duration / (loops * size);
            System.out.printf("%-8d", duration);
        }
        System.out.println();

    }

}
