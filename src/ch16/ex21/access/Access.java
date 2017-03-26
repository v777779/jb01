package ch16.ex21.access;

import lib.generate.Gen;
import lib.utils.BerylliumSphere;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 21 Array Sort Check\n");

        System.out.println("Array Sort:");
        Random rnd = new Random();
        BerylliumSphere[] baseArray = Gen.getArray(BerylliumSphere.class,BerylliumSphere.gen(),25);
        BerylliumSphere[] bArray = new BerylliumSphere[7];
        BerylliumSphere[] cArray = new BerylliumSphere[7];

        boolean [] checked = new boolean[baseArray.length];

        for (int i = 0; i < bArray.length; i++) {
            int index = rnd.nextInt(baseArray.length);
            while (checked[index]) {
                index = rnd.nextInt(baseArray.length);
            }
            checked[index]= true;
            bArray[i] = baseArray[index];
            while (checked[index]) {
                index = rnd.nextInt(baseArray.length);
            }
            checked[index]= true;
            cArray[i] = baseArray[index];
        }

        System.out.println("unsorted:"+ Arrays.toString(bArray));
        System.out.println("unsorted:"+ Arrays.toString(cArray));
        Arrays.sort(bArray);
        Arrays.sort(cArray, BerylliumSphere.getComp());
        System.out.println("forward :"+Arrays.toString(bArray));
        System.out.println("reverse :"+Arrays.toString(cArray));



    }
}
