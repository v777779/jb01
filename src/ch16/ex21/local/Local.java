package ch16.ex21.local;

import lib.generate.Gen;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nArray Element Comparison Check\n");

        System.out.println("Comparison via Comparable Interface:");
        CompType[] array = Gen.getArray(new CompType[12],CompType.gen()); // пустой динамический массив и такой же метод

        System.out.println("unsorted:"+CompType.toString(array));
        Arrays.sort(array);  // сортировать по i
        System.out.println("sorted  :"+CompType.toString(array));

        System.out.println("Comparison via Comparator Interface:");
        CompType2[] bArray = Gen.getArray(new CompType2[8],CompType2.gen()); // пустой динамический массив и такой же метод

        System.out.println("unsorted:"+CompType2.toString(bArray));
        Arrays.sort(bArray, CompType2.getComparator());  // сортировать по i
        System.out.println("sorted  :"+CompType2.toString(bArray));



    }
}
