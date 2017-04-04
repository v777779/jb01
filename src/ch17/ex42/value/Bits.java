package ch17.ex42.value;

import lib.utils.Print;

import java.util.BitSet;
import java.util.Random;

/**
 * Created by V1 on 04-Apr-17.
 */
public class Bits {
    public static String toString(BitSet bitSet) {
        System.out.println("bits:" + bitSet);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bitSet.size(); i++) {
            sb.append(bitSet.get(i) ? "1" : "0");
        }
        return sb.toString();
    }


    public static void check() {
        Random rnd = new Random();

        System.out.println("Byte to Bits:");
        byte byteValue = (byte) rnd.nextInt(); // отсечь все что больше
        BitSet bitSet = new BitSet();
        for (int i = 7; i >= 0; i--) {    // обратный for
            if (((1 << i) & byteValue) != 0) {  // сдвигом отработать весь байт
                bitSet.set(i);              // установить соответствующий бит
            } else {
                bitSet.clear(i);
            }
        }
        System.out.println("byte value:" + byteValue + " 0b" + Print.pBits(byteValue));
        System.out.println("bit pattern:" + toString(bitSet));

        System.out.println("Short to Bits:");
        short shortValue = (short) rnd.nextInt(); // отсечь все что больше
        bitSet = new BitSet();
        for (int i = 15; i >= 0; i--) {    // обратный for
            if (((1 << i) & shortValue) != 0) {  // сдвигом отработать весь байт
                bitSet.set(i);              // установить соответствующий бит
            } else {
                bitSet.clear(i);
            }
        }
        System.out.println("short value:" + shortValue + " 0b" + Print.pBits(shortValue));
        System.out.println("bit pattern:" + toString(bitSet));

        System.out.println("Int to Bits:");
        int intValue =  rnd.nextInt(); // отсечь все что больше
        bitSet = new BitSet();
        for (int i = 31; i >= 0; i--) {    // обратный for
            if (((1 << i) & intValue) != 0) {  // сдвигом отработать весь байт
                bitSet.set(i);              // установить соответствующий бит
            } else {
                bitSet.clear(i);
            }
        }
        System.out.println("int value:" + intValue + " 0x"+ Integer.toHexString(intValue).toUpperCase()+
                                        " 0b" + Print.pBits(intValue));
        System.out.println("bit pattern:" + toString(bitSet));

        System.out.println("BitSet 127:");
        BitSet b127 = new BitSet();
        b127.set(127);
        b127.set(2047);
        System.out.println("bit pattern:" + b127);

        System.out.println("BitSet 255:");
        BitSet b255 = new BitSet();
        b255.set(255);
        System.out.println("bit size:" + b255.size());
        b255.set(256);
        System.out.println("bit size:" + b255.size());
        System.out.println("bit pattern:" + b255);

        System.out.println("BitSet 512:");
        BitSet b512 = new BitSet();
        b512.set(511);
        b512.set(512);
        System.out.println("bit pattern:" + b512);
        System.out.println("bit size:" + b512.size());
        b512.clear(512);
        System.out.println("bit pattern:" + b512);
        System.out.println("bit size:" + b512.size());
        b512.clear();
        System.out.println("b512 clear() size:" + b512.size()+ " "+b512.isEmpty());

        System.out.println("BitSet 1024:");
        BitSet b1024 = new BitSet();
        b1024.set(1023);
        System.out.println("bit pattern:" + b1024);
        System.out.println("bit size:" + b1024.size());



    }
}
