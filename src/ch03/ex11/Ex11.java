package ch.ex11;

import ch.ex10.Int;

/**
 * Created by V1 on 04-Feb-17.
 */

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("Check unsigned shift");
        System.out.println("Integer Shift");
        int i =  -1;
        System.out.println(Int.toBinaryString(i));
        i>>>=10;
        System.out.println(Int.toBinaryString(i));
        i =  -1;
        System.out.println(Int.toBinaryString(i));
        i>>=10;
        System.out.println(Int.toBinaryString(i));
        i<<=4;
        System.out.println(Int.toBinaryString(i));
        i>>>=3;
        System.out.println(Int.toBinaryString(i));
        System.out.println("Long Shift");
        long l = -1;
        System.out.println(Int.toBinaryString(l));
        l>>>=5;
        System.out.println(Int.toBinaryString(l));
        l<<=3;
        System.out.println(Int.toBinaryString(l));
        System.out.println("Short Shift");
        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        s>>>=4;
        System.out.println(Integer.toBinaryString(s));  // >>> не работает с типом Short
        s = 10;
        System.out.println(Int.toBinaryString(s));
        System.out.println("Byte Shift");
        byte b = -1;
        System.out.println(Int.toBinaryString(b));
        b>>>=4;
        System.out.println(Int.toBinaryString(b));  // >>> не работает с типом Byte
        b=10;
        System.out.println(Int.toBinaryString(b));  // >>> не работает с типом Byte
        System.out.println();

        System.out.println("\nExercise 11\n");
        int c = 0x80000000;
        System.out.println("Signed Right Shift");
        for (int j = 0; j < 32; j++) {
            System.out.println(Int.toBinaryString(c));
            c>>=1;
        }
    }
}
