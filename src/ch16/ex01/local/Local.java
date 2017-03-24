package ch16.ex01.local;

import lib.utils.BerylliumSphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nContainer Comparison Check\n");

        System.out.println("Array of Spheres:");
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres)); // вызовет toString() каждой BerSphere
        System.out.println(spheres[4]);

        System.out.println("\nList of Spheres:");
        List<BerylliumSphere> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new BerylliumSphere());
        }
        System.out.println(list);
        System.out.println(list.get(4));

        System.out.println("\nArray of  int[]:");
        int[] ints = new int[]{0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ints));
        System.out.println(ints[4]);

        System.out.println("\nList of Integer:");
        List<Integer> listInt = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        listInt.add(97);
        System.out.println(listInt);
        System.out.println(listInt.get(4));



    }
}
