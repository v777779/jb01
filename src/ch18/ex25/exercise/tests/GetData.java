package ch18.ex25.exercise.tests;

import java.nio.ByteBuffer;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class GetData {

    public static void check() {
        final int BSIZE = 1024;
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        int i = 0;
        while (i++ < bb.limit()) {  // прогнать весь буфер
            if (bb.get() != 0) {
                System.out.println("bb.get() != 0");
            }
        }
        System.out.println("i=" + i);
//char
        bb.rewind();
        bb.asCharBuffer().put("Hello World!");
        char ch;
        System.out.print("char  :");
        while ((ch = bb.getChar()) != 0) {
            System.out.print(ch + " ");
        }
        System.out.println();
//short
        bb.rewind();
        bb.asShortBuffer().put((short)2272);
        System.out.println("short :"+bb.getShort());
//int
        bb.rewind();
        bb.asIntBuffer().put(12272);
        System.out.println("int   :"+bb.getInt());
//long
        bb.rewind();
        bb.asLongBuffer().put(112272);
        System.out.println("long  :"+bb.getLong());
//float
        bb.rewind();
        bb.asFloatBuffer().put(1.2272F);
        System.out.println("float :"+bb.getFloat());
//double
        bb.rewind();
        bb.asDoubleBuffer().put(1.12272);
        System.out.println("double:"+bb.getDouble());
    }
}
