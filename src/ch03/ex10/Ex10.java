package ch03.ex10;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Ex10 {

    public static void main(String[] args) {
        final int a = 0xAAAAAAAA;
        final int b = 0x55555555;
        int c, d, e, f, g, h, j;

        System.out.println("Bit operators");
        c = a & b;  // bitwise AND
        d = a | b; // bitwise OR
        e = a ^ b; // bitwise XOR
        f = ~a; // bitwise NOT
        g = ~b; // bitwise NOT
        h = 0x0000FFFF;
        h &= a;
        j = 0xFFFF0000;
        j |= b;

        System.out.println("\nHex Format");
        System.out.printf(" c = a & b;     // bitwise AND > 0x%08X\n", c);
        System.out.printf(" d = a | b ;     // bitwise OR > 0x%08X\n", d);
        System.out.printf("e = a ^ b;      // bitwise XOR > 0x%08X\n", e);
        System.out.printf("f = ~a;         // bitwise NOT > 0x%08X\n", f);
        System.out.printf("g = ~b;         // bitwise NOT > 0x%08X\n", g);
        System.out.printf("h = 0x0000FFFF;        h &= a; > 0x%08X\n", h);
        System.out.printf("j = 0xFFFF0000;        j |= b; > 0x%08X\n", j);

        int i = 10;
        String i1 = Integer.toUnsignedString(i,2); // перевели 10 в строку 1010
        int i2 = Integer.valueOf(i1); // перевели строку 1010 в int 1010
        System.out.println("\nDecimal to Binary to Decimal Technology");
        System.out.println("\nBDB > i:"+i+" i1:"+i1+" i2:"+i2+" i2>1000: "+(i2>1000));
        System.out.printf("printf i2 as 8-digit decimal > %08d\n",i2);


        System.out.println("\nBinary Format");

        e&=0x0FFF0FFF;
        int m = 0x0A;
        System.out.println("conv :"+m+" "+ Int.toBinaryString(m));

        System.out.println();
        System.out.printf(" c = a & b;     // bitwise AND > 0x%08X %s\n", c, Int.decBinS(c));
        System.out.printf(" d = a | b ;     // bitwise OR > 0x%08X %s\n", d, Int.decBinS(d));
        System.out.printf(" d = a | b ;     // bitwise OR > 0x%08X %s\n", d, Int.decBinS(d));
        System.out.printf("e = a ^ b;      // bitwise XOR > 0x%08X %s\n", e, Int.decBinS(e));
        System.out.printf("f = ~a;         // bitwise NOT > 0x%08X %s\n", f, Int.decBinS(f));
        System.out.printf("g = ~b;         // bitwise NOT > 0x%08X %s\n", g, Int.decBinS(g));
        System.out.printf("h = 0x0000FFFF;        h &= a; > 0x%08X %s\n", h, Int.decBinS(h));
        System.out.printf("j = 0xFFFF0000;        j |= b; > 0x%08X %s\n", j, Int.decBinS(j));


        System.out.println();
        System.out.printf(" c = a & b;     // bitwise AND > 0x%08X %s\n", c, Int.toBinaryString(c));
        System.out.printf(" d = a | b ;     // bitwise OR > 0x%08X %s\n", d, Int.toBinaryString(d));
        System.out.printf(" d = a | b ;     // bitwise OR > 0x%08X %s\n", d, Int.toBinaryString(d));
        System.out.printf("e = a ^ b;      // bitwise XOR > 0x%08X %s\n", e, Int.toBinaryString(e));
        System.out.printf("f = ~a;         // bitwise NOT > 0x%08X %s\n", f, Int.toBinaryString(f));
        System.out.printf("g = ~b;         // bitwise NOT > 0x%08X %s\n", g, Int.toBinaryString(g));
        System.out.printf("h = 0x0000FFFF;        h &= a; > 0x%08X %s\n", h, Int.toBinaryString(h));
        System.out.printf("j = 0xFFFF0000;        j |= b; > 0x%08X %s\n", j, Int.toBinaryString(j));


        System.out.println("Long Format");
        System.out.println(Conv.toBinaryString(-1L));
 //       System.out.println(Conv.toBinaryString(120L));

long k = -1;
  //      System.out.println(Long.numberOfLeadingZeros(k));

    }
}
