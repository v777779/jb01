package ch16.ex16.access;

import lib.generate.ConvTo;
import lib.generate.Gen;

import java.util.Arrays;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 16 Check\n");

        System.out.println("\nPrimitive Test Generator:");
        int size = 6;
        boolean[] a1 = ConvTo.primitive(Gen.getArray(Boolean.class,new SkipGen.GenBool(true),size));
        byte[] a2 = ConvTo.primitive(Gen.getArray(Byte.class,new SkipGen.GenByte((byte)2),size));
        char[] a3 =  ConvTo.primitive(Gen.getArray(Character.class,new SkipGen.GenChar(5),size));
        short[] a4 =  ConvTo.primitive(Gen.getArray(Short.class,new SkipGen.GenShort((short)6),size));
        int[] a5 =  ConvTo.primitive(Gen.getArray(Integer.class,new SkipGen.GenInt(10),size));
        long[] a6 =  ConvTo.primitive(Gen.getArray(Long.class,new SkipGen.GenLong(12L),size));
        float[] a7 =  ConvTo.primitive(Gen.getArray(Float.class,new SkipGen.GenFloat(0.32F),size));
        double[] a8 =  ConvTo.primitive(Gen.getArray(Double.class,new SkipGen.GenDouble(0.64),size));

        System.out.println("boolean:"+ Arrays.toString(a1));
        System.out.println("byte   :"+Arrays.toString(a2));
        System.out.println("char   :"+Arrays.toString(a3));
        System.out.println("short  :"+Arrays.toString(a4));
        System.out.println("int    :"+Arrays.toString(a5));
        System.out.println("long   :"+Arrays.toString(a6));
        System.out.println("float  :"+Arrays.toString(a7));
        System.out.println("double :"+Arrays.toString(a8));

    }
}
