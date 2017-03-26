package ch16.ex18.local;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nArrays Methods Check\n");
        int[] iArray = new int[7];
        int[] jArray = new int[10];
        int[] kArray = new int[5];

        System.out.println("Arrays methods for int[]:");
        System.out.println("Arrays.fill():");
        Arrays.fill(iArray,15);
        Arrays.fill(jArray,125);
        Arrays.fill(kArray,19);
        System.out.println("iArray:"+Arrays.toString(iArray));
        System.out.println("jArray:"+Arrays.toString(jArray));
        System.out.println("kArray:"+Arrays.toString(kArray));

        System.out.println("\nSystem.arraycopy():");
        System.arraycopy(iArray,0,jArray,0, iArray.length); // меньшую длину берем
        System.arraycopy(iArray,0,kArray,0, kArray.length); // меньшую длину берем
        System.out.println("iArray:"+Arrays.toString(iArray));
        System.out.println("jArray:"+Arrays.toString(jArray));
        System.out.println("kArray:"+Arrays.toString(kArray));

        Arrays.fill(kArray,104);
        System.arraycopy(kArray,0,iArray,0, kArray.length); // меньшую длину берем
        System.out.println("iArray:"+Arrays.toString(iArray));
        System.out.println("kArray:"+Arrays.toString(kArray));

        System.out.println("\nArrays methods for Object[]:");
        Integer[] uInt = new Integer[10];
        Integer[] vInt = new Integer[5];

        System.out.println("Arrays.fill():");
        Arrays.fill(uInt,15);
        Arrays.fill(vInt,125);

        System.out.println("uInt  :"+Arrays.toString(uInt));
        System.out.println("vInt  :"+Arrays.toString(vInt));


        System.out.println("\nSystem.arraycopy():");
        System.arraycopy(vInt,0,uInt,0, vInt.length); // меньшую длину берем
        System.out.println("uInt  :"+Arrays.toString(uInt));
        System.out.println("vInt  :"+Arrays.toString(vInt));

    }
}
