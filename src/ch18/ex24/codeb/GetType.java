package ch18.ex24.codeb;

import java.nio.*;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 12-Apr-17.
 */
public class GetType {
    public static void check() {
        ByteBuffer bb = ByteBuffer.wrap(new byte[]{ 0, 0, 0, 0, 0, 0, 0, 'a'});
//byte
        System.out.print("Byte Buffer  :");
        bb.rewind();
        while (bb.hasRemaining()) {
            System.out.print(bb.position()+"->"+bb.get()+", ");
        }
        System.out.println();
//char
        System.out.print("Char Buffer  :");
        CharBuffer cb = ((ByteBuffer)bb.rewind()).asCharBuffer();
        while (cb.hasRemaining()) {
            System.out.print(cb.position()+"->"+cb.get()+", ");
        }
        System.out.println();
//short
        System.out.print("Short Buffer :");
        ShortBuffer sb = ((ByteBuffer)bb.rewind()).asShortBuffer();
        while (sb.hasRemaining()) {
            System.out.print(sb.position()+"->"+sb.get()+", ");
        }
        System.out.println();
//int
        System.out.print("Int Buffer   :");
        IntBuffer ib = ((ByteBuffer)bb.rewind()).asIntBuffer();
        while (ib.hasRemaining()) {
            System.out.print(ib.position()+"->"+ib.get()+", ");
        }
        System.out.println();
//long
        System.out.print("Long Buffer  :");
        LongBuffer lb = ((ByteBuffer)bb.rewind()).asLongBuffer();
        while (lb.hasRemaining()) {
            System.out.print(lb.position()+"->"+lb.get()+", ");
        }
        System.out.println();
//float
        System.out.print("Float Buffer :");
        FloatBuffer fb = ((ByteBuffer)bb.rewind()).asFloatBuffer();
        while (fb.hasRemaining()) {
            System.out.print(fb.position()+"->"+fb.get()+", ");
        }
        System.out.println();
//double
        System.out.print("Double Buffer:");
        DoubleBuffer db = ((ByteBuffer)bb.rewind()).asDoubleBuffer();
        while (db.hasRemaining()) {
            System.out.print(db.position()+"->"+db.get()+", ");
        }
        System.out.println();




    }
}
