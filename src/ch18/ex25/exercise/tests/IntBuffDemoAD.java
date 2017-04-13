package ch18.ex25.exercise.tests;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class IntBuffDemoAD {
    private static void show(IntBuffer ib) {
        for (ib.rewind(); ib.hasRemaining(); ) {
            System.out.print(ib.get() + " ");
        }
        System.out.println();

    }
    public static void check() {
        final int BSIZE = 1024;
        ByteBuffer bb = ByteBuffer.allocateDirect(BSIZE);
        IntBuffer ib = bb.asIntBuffer();

        ib.put(new int[]{1, 5, 8, 10, 12, 14, 10, 47, 29, 34, 56, 79});
        System.out.print("ib          :");
        show(ib);
//put()
        ib.position(14);  // это ключевое доступная позиция буфера
        ib.put(256);
        ib.put(32);
        System.out.print("ib          :");
        show(ib);
//get()
        System.out.println("ib.get(5)   :" + ib.get(5));
//flip()
        ib.position(20);  // новая текущая позиция
        ib.flip(); // подрезает буфер по заданной позиции
        System.out.print("ib.flip()   :");
        show(ib);
//put(n,v)
        ib.put(18,305);
        System.out.print("ib.put(18,n):");
        show(ib);


    }
}
