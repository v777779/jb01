package ch16.ex18.access;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise Check\n");
        BerylliumSphere2[] aBer = new BerylliumSphere2[5];

         Arrays.fill(aBer, new BerylliumSphere2());
        BerylliumSphere2[] bBer = new BerylliumSphere2[5];
        System.arraycopy(aBer,0,bBer,0,aBer.length);
        System.out.println("aBer:"+Arrays.toString(aBer));
        System.out.println("bBer:"+Arrays.toString(bBer));

        System.out.println("Changing aBer[1]:");
        aBer[0] = new BerylliumSphere2();
        bBer[2]= aBer[0];
        aBer[1].setId(12);
        System.out.println("aBer:"+Arrays.toString(aBer));
        System.out.println("bBer:"+Arrays.toString(bBer));
        System.out.println("Changing bBer[4]:");
        bBer[2].setId(16);
        System.out.println("aBer:"+Arrays.toString(aBer));
        System.out.println("bBer:"+Arrays.toString(bBer));
    }
}
