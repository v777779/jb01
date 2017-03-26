package ch16.ex11.integra;

import lib.generate.*;

import java.util.Arrays;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nArray IGenerator Check\n");

        System.out.println("Object Based Arrays:");
        Integer[] array = {9, 8, 7, 6};
        System.out.println(Arrays.toString(array));
        Integer[] bArray = Gen.getArray(array, new GenSeq.GenInt()); // заполнить Integer чтобы не срабатывал
        System.out.println(Arrays.toString(bArray)); // конфликт toArray(array) обязательно с аргументом
        Object[] cArray = Gen.getArray(array, new GenSeq.GenInt()); // стирание позволяет заполнить Object[]
        System.out.println(Arrays.toString(cArray));
        Integer[] dArray = Gen.getArray(Integer.class, new GenSeq.GenInt(), 15); //
        System.out.println(Arrays.toString(dArray));
        String[] sArray = Gen.getArray(String.class, new GenRnd.GenStr(), 15); //
        System.out.println(Arrays.toString(sArray));
        Object[] tArray = Gen.getArray(String.class, new GenRnd.GenStr(), 15); //
        System.out.println(Arrays.toString(tArray));

        System.out.println("\nPrimitive Based Arrays:");
        Integer[] fArrayRnd = Gen.getArray(array, new GenRnd.GenInt());
        int [] aInts = ConvTo.primitive(fArrayRnd); // случайный массив заполнить
        System.out.println("Integer[]:" + Arrays.toString(fArrayRnd));
        System.out.println("int[]    :" + Arrays.toString(aInts));

        int [] bInts = ConvTo.primitive(Gen.getArray(Integer.class,new GenRnd.GenInt(),10));
        char [] chs = ConvTo.primitive(Gen.getArray(Character.class,new GenRnd.GenChar(),10));

        System.out.println("int[]    :" + Arrays.toString(bInts));
        System.out.println("char[]   :" + Arrays.toString(chs));

        System.out.println("\nPrimitive Test Generator:");
        int size = 6;
        boolean[] a1 = ConvTo.primitive(Gen.getArray(Boolean.class,new GenRnd.GenBool(),size));
        byte[] a2 = ConvTo.primitive(Gen.getArray(Byte.class,new GenRnd.GenByte(),size));
        char[] a3 =  ConvTo.primitive(Gen.getArray(Character.class,new GenRnd.GenChar(),size));
        short[] a4 =  ConvTo.primitive(Gen.getArray(Short.class,new GenRnd.GenShort(),size));
        int[] a5 =  ConvTo.primitive(Gen.getArray(Integer.class,new GenRnd.GenInt(),size));
        long[] a6 =  ConvTo.primitive(Gen.getArray(Long.class,new GenRnd.GenLong(),size));
        float[] a7 =  ConvTo.primitive(Gen.getArray(Float.class,new GenRnd.GenFloat(),size));
        double[] a8 =  ConvTo.primitive(Gen.getArray(Double.class,new GenRnd.GenDouble(),size));

        System.out.println("boolean:"+Arrays.toString(a1));
        System.out.println("byte   :"+Arrays.toString(a2));
        System.out.println("char   :"+Arrays.toString(a3));
        System.out.println("short  :"+Arrays.toString(a4));
        System.out.println("int    :"+Arrays.toString(a5));
        System.out.println("long   :"+Arrays.toString(a6));
        System.out.println("float  :"+Arrays.toString(a7));
        System.out.println("double :"+Arrays.toString(a8));



    }
}
