package ch18.ex24.exercise;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class GetDbl {
    private static void show(DoubleBuffer db) {
        for (db.rewind(); db.hasRemaining(); ) {
            System.out.print(db.get() + " ");
        }
        System.out.println();

    }
    public static void check() {
        final int BSIZE = 1024;
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        DoubleBuffer db = bb.asDoubleBuffer();

        db.put(new double[]{1.23, 5.41, 8.784, 10.21, 12.34, 14.89, 10.24, 47.01, 29.325, 34.124, 56.15, 79.18});
        System.out.print("db          :");
        show(db);
//put()
        db.position(14);  // это ключевое доступная позиция буфера
        db.put(256.1784);
        db.put(32.2358);
        System.out.print("db          :");
        show(db);
//get()
        System.out.println("db.get(5)   :" + db.get(5));

//flip()
        db.position(20);  // новая текущая позиция
        db.flip(); // подрезает буфер по заданной позиции
        System.out.print("db.flip()   :");
        show(db);
//put(n,v)
        db.put(18,18.305);
        System.out.print("ib.put(18,n):");
        show(db);

    }
}
