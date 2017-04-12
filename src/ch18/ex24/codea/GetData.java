package ch18.ex24.codea;

import java.nio.ByteBuffer;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class GetData {

    public static void check() {
        final int BSIZE = 1024;
        ByteBuffer bf = ByteBuffer.allocate(BSIZE);
        int i = 0;
        while (i++ < bf.limit()) {  // прогнать весь буфер
            if (bf.get() != 0) {
                System.out.println("bf.get() != 0");
            }
        }
        System.out.println("i=" + i);
//char
        bf.rewind();
        bf.asCharBuffer().put("Hello World!");
        char ch;
        System.out.print("char  :");
        while ((ch = bf.getChar()) != 0) {
            System.out.print(ch + " ");
        }
        System.out.println();
//short
        bf.rewind();
        bf.asShortBuffer().put((short)2272);
        System.out.println("short :"+bf.getShort());
//int
        bf.rewind();
        bf.asIntBuffer().put(12272);
        System.out.println("int   :"+bf.getInt());
//long
        bf.rewind();
        bf.asLongBuffer().put(112272);
        System.out.println("long  :"+bf.getLong());
//float
        bf.rewind();
        bf.asFloatBuffer().put(1.2272F);
        System.out.println("float :"+bf.getFloat());
//double
        bf.rewind();
        bf.asDoubleBuffer().put(1.12272);
        System.out.println("double:"+bf.getDouble());
    }
}
