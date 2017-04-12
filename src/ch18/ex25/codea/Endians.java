package ch18.ex25.codea;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class Endians {
    public static void check() {
        ByteBuffer bb = ByteBuffer.wrap(new byte[12]);
        bb.asCharBuffer().put("abcdef"); // 6 символов в 12 посадочных мест
        System.out.println("Char sequence: \"abcdef\":");
        System.out.println("DEFAULT ENDIAN:");
        System.out.println(Arrays.toString(bb.array()));

        System.out.println("BIG_ENDIAN");
        bb.order(ByteOrder.BIG_ENDIAN);
        bb.asCharBuffer().put("abcdef"); // 6 символов в 12 посадочных мест
        System.out.println(Arrays.toString(bb.array()));

        System.out.println("LITTLE_ENDIAN");
        bb.order(ByteOrder.LITTLE_ENDIAN);
        bb.asCharBuffer().put("abcdef"); // 6 символов в 12 посадочных мест
        System.out.println(Arrays.toString(bb.array()));

        System.out.println("\nInteger representation:");
        bb = ByteBuffer.wrap(new byte[4]);  // типа байты

        System.out.println("BIG_ENDIAN");
        bb.order(ByteOrder.BIG_ENDIAN);
        bb.asIntBuffer().put(16777216);
        System.out.println("int:"+ bb.asIntBuffer().get());
        System.out.println(Arrays.toString(bb.array()));

        System.out.println("LITTLE_ENDIAN");
        bb.order(ByteOrder.LITTLE_ENDIAN);
        System.out.println("int:"+ bb.asIntBuffer().get());
        System.out.println(Arrays.toString(bb.array()));

    }
}
