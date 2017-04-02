package ch17.ex31.access;

import lib.maps.Countries;
import lib.tests.TestParam;
import lib.tests.Tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void printHeader(String s) {
        System.out.print("size  : ");
        for (TestParam param : Tester.defaultParams) {
            System.out.printf("%-8d", param.size);
        }
        System.out.println();
        System.out.print(s);
    }

    public static void testList(List<String> list) {
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
                    list.add("Hello");
                }
// полоса замера
                duration += (System.nanoTime() - start);
            }
            duration = duration / (loops * size);
            System.out.printf("%-8d", duration);
        }
        System.out.println();

        System.out.print("remove: ");
        for (TestParam param : Tester.defaultParams) {
            int loops = param.loops;
            int size = param.size;
            long start = 0;
            long duration = 0;
            for (int i = 0; i < param.loops; i++) {
                list.clear();
                size = param.size;
                while (size > 50) {
                    list.addAll(Countries.names(50));
                    size -= 50;
                }
                list.addAll(Countries.names(size));
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

    }

    public static void testArray(ContString list) {
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
                    list.add("Hello");
                }
// полоса замера
                duration += (System.nanoTime() - start);
            }

            duration = duration / (loops * size);
            System.out.printf("%-8d", duration);
        }
        System.out.println();

        System.out.print("remove: ");
        for (TestParam param : Tester.defaultParams) {
            int loops = param.loops;
            int size = param.size;
            long start = 0;
            long duration = 0;
            for (int i = 0; i < param.loops; i++) {
                size = param.size;
                list.clear();
                while (size > 50) {
                    list.addAll(Countries.names(50));
                    size -= 50;
                }
                list.addAll(Countries.names(size));
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

    }


    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 31 Array String Check\n");
        testList(new ArrayList<>());
        testList(new LinkedList<>());
        testArray(new ContString(0));


    }
}
