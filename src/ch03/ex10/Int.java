package ch03.ex10;

import java.util.Arrays;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Int {

    public static String toBinaryString(int i) {
        String s = Integer.toBinaryString(i);
        char[] chs = new char[Integer.SIZE - s.length()]; //длина массива
        Arrays.fill(chs, 0, chs.length, '0');
        return (String.valueOf(chs) + s);
    }

    public static String toBinaryString(long i) {
        String s = Long.toBinaryString(i);
        char[] chs = new char[Long.SIZE - s.length()]; //длина массива
        Arrays.fill(chs, 0, chs.length, '0');
        return (String.valueOf(chs) + s);
    }

    public static String toBinaryString(short i) {
        String s = Integer.toBinaryString(i);
        if (s.length() > Short.SIZE) {
            s = s.substring(s.length()-Short.SIZE, s.length());
        }
        char[] chs = new char[Short.SIZE - s.length()]; //длина массива
        Arrays.fill(chs, 0, chs.length, '0');
        return (String.valueOf(chs) + s);
    }

    public static String toBinaryString(char i) {
        return ((Integer.toBinaryString(0x10000+i)).substring(1)) ;
    }


     public static String toBinaryString(byte i) {
          String s = Integer.toBinaryString(i);
         if (s.length() > Byte.SIZE) {
             s = s.substring(s.length()-Byte.SIZE, s.length());
         }
          char[] chs = new char[Byte.SIZE - s.length()]; //длина массива
          Arrays.fill(chs, 0, chs.length, '0');
         return (String.valueOf(chs) + s);
     }


    public static String decBinS(int i) {
        String s = Integer.toUnsignedString(i, 2);
        String sVal;
        String s2 = "";
        for (int j = 0; j < 4; j++) {
            if (s.length() >= 8) {
                sVal = s.substring(s.length() - 8, s.length());
                s = s.substring(0, s.length() - 8);
            } else {
                sVal = s.substring(0, s.length());
                s = "";
            }
            s2 = String.format("%08d", Long.valueOf("0" + sVal)) + s2;
        }
//        s[3] =  s1.substring(24);
//        s[2] =  s1.substring(16,24);
//        s[1] =  s1.substring(8,16);
//        s[0] = s1.substring(0,8);
        return s2;
    }
}
