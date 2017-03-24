package ch04.ex5;

import ch04.ex4.Conv;

/**
 * Created by V1 on 05-Feb-17.
 */
public class Ex5 {
    public static void main(String[] args) {
        final int a = 0xAAAAAAAA;
        final int b = 0x55555555;
        int c, d, e, f, g, h, j;

        System.out.println("Bit operators");
        c = a & b;      // bitwise AND
        d = a | b;      // bitwise OR
        e = a ^ b;      // bitwise XOR
        f = ~a;         // bitwise NOT
        g = ~b;         // bitwise NOT
        h = 0x0000FFFF;
        h &= a;
        j = 0xFFFF0000;
        j |= b;

        System.out.println("\nHex  Binary Format ");
        System.out.println();
        System.out.printf("c = a & b;      // bitwise AND > 0x%08X %s\n", c, Conv.toBinaryString(c));
        System.out.printf("d = a | b ;     // bitwise OR  > 0x%08X %s\n", d, Conv.toBinaryString(d));
        System.out.printf("d = a | b ;     // bitwise OR  > 0x%08X %s\n", d, Conv.toBinaryString(d));
        System.out.printf("e = a ^ b;      // bitwise XOR > 0x%08X %s\n", e, Conv.toBinaryString(e));
        System.out.printf("f = ~a;         // bitwise NOT > 0x%08X %s\n", f, Conv.toBinaryString(f));
        System.out.printf("g = ~b;         // bitwise NOT > 0x%08X %s\n", g, Conv.toBinaryString(g));
        System.out.printf("h = 0x0000FFFF;        h &= a; > 0x%08X %s\n", h, Conv.toBinaryString(h));
        System.out.printf("j = 0xFFFF0000;        j |= b; > 0x%08X %s\n", j, Conv.toBinaryString(j));
        System.out.println();
        System.out.printf("c = a & b;      // bitwise AND > 0x%08X %s\n", c, ConvTern.toBinaryString(c));
        System.out.printf("d = a | b ;     // bitwise OR  > 0x%08X %s\n", d, ConvTern.toBinaryString(d));
        System.out.printf("d = a | b ;     // bitwise OR  > 0x%08X %s\n", d, ConvTern.toBinaryString(d));
        System.out.printf("e = a ^ b;      // bitwise XOR > 0x%08X %s\n", e, ConvTern.toBinaryString(e));
        System.out.printf("f = ~a;         // bitwise NOT > 0x%08X %s\n", f, ConvTern.toBinaryString(f));
        System.out.printf("g = ~b;         // bitwise NOT > 0x%08X %s\n", g, ConvTern.toBinaryString(g));
        System.out.printf("h = 0x0000FFFF;        h &= a; > 0x%08X %s\n", h, ConvTern.toBinaryString(h));
        System.out.printf("j = 0xFFFF0000;        j |= b; > 0x%08X %s\n", j, ConvTern.toBinaryString(j));

        System.out.println(ConvTern.toBinaryString(200));
        System.out.println(ConvTern.toBinaryString(0x7F));
    }
}
