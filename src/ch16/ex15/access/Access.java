package ch16.ex15.access;

import lib.generate.Gen;
import lib.utils.BerylliumSphere;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 15 Container Comparison Check\n");

        BerylliumSphere[] bSpheres = new BerylliumSphere[10];
        bSpheres = Gen.getArray(bSpheres,new GenBer());
        BerylliumSphere[] cSpheres = Gen.getArray(BerylliumSphere.class,new GenBer(),10);

        System.out.println(Arrays.toString(bSpheres));
        System.out.println(Arrays.toString(cSpheres));


    }
}
