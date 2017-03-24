package ch13.ex05.access;

import java.math.BigInteger;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    private static void print(char[] c) {
        System.out.println(c);
    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static void inkey() {
        Scanner in = new Scanner(System.in);
        in.next();

    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 5 Format Check\n");
        Formatter f = new Formatter(System.out);


        char u = 'a';
        System.out.println("u = 'a' ");
        System.out.println("--------");
        f.format("s %%1$-10s   : %1$-10s\n", u);
        f.format("c %%1$-10c   : %1$-10c\n", u);
        f.format("b %%1$-10.10b: %1$-10.10b\n", u);
        f.format("h %%1$-10.10h: %1$-10.10h\n", u);

        System.out.println();
        int v = 121;
        System.out.println("v = "+v);
        f.format("d %%1$(,0+10d: %1$(,0+10d\n", v);
        f.format("d %%1$-(, 10d: %1$-(, 10d\n", v);

        f.format("c %%1$-10c: %1$-10c\n", v);
        f.format("b %%1$-10.10b: %1$-10.10b\n", v);
        f.format("s %%1$-10.10s: %1$-10.10s\n", v);
//        f.format("f: %f\n",v);
//        f.format("e: %e\n",v);
        f.format("x %%1$-10X: %1$-10X\n", v);
        f.format("h %%1$-10.10H: %1$-10.10H\n", v);

        System.out.println();
        BigInteger w = new BigInteger("500000000");
        System.out.println("w = BigInteger 5e8");
        f.format("d 1 %%1$(,0+10d: %1$(,0+10d\n", w.negate());
        f.format("d 2 %%1$,0+10d : %1$,0+10d\n", w.negate());
        f.format("d 3 %%1$-(, 10d: %1$-(, 10d\n", w);
        f.format("d 3 %%1$-(, 10d: %1$-(, 10d\n", w.negate());

        f.format("b %%1$-10.10   : %1$-10.10b\n", w);
        f.format("s %%1$10s      : %1$10s\n", w);
        f.format("x %%1$-10X     : %1$-10X |\n", w);
        f.format("h %%1$-10.10H  : %1$-10.10H |\n", w);

        System.out.println();
        double x = 179.543;
        System.out.println("x = "+x);
        f.format("b %%1$-10.10b  : %1$-10.10b |\n", x);
        f.format("s %%1$-10.10s  : %1$-10.10s |\n", x);
        f.format("f %%1$(,0+10.2f: %1$(,0+10.2f |\n", x);
        f.format("f %%1$(,- 10.2f: %1$(,- 10.2f |\n", x);
        f.format("f %%1$(,0+10.2f: %1$(,0+10.2f |\n", -x);
        f.format("e %%1$(0+10.3e : %1$(0+10.3e |\n", x);
        f.format("e %%1$(- 10.3e : %1$(- 10.3e |\n", x);
        f.format("e %%1$(0+10.3e : %1$(0+10.3e|\n", -x);
        f.format("h %%1$-10.10H  : %1$-10.10H |\n", x);
        System.out.println();

        Access y = new Access();
        System.out.println("y = new Local()");
        f.format("b %%1$-10.10b  : %1$-10.10b |\n", y);
        f.format("s %%1$-10.10s  : %1$-10.10s |\n", y);
        f.format("h %%1$-10.10h  : %1$-10.10h |\n", y);

        System.out.println();

        boolean z = false;
        System.out.println("z = false");
        f.format("b %%1$-10.10b  : %1$-10.10b |\n", z);
        f.format("s %%1$-10.10s  : %1$-10.10s |\n", z);
        f.format("h %%1$-10.10h  : %1$-10.10h |\n", z);

        f.format("%%: %-10%\n");



    }
}
