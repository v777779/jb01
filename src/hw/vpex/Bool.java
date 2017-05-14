package hw.vpex;

/**
 * Vadim Voronov
 * Created: 14-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Bool {

    public static void main(String args[]) {
         int p,q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = 1;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p == 1?0:1));
        p = 1;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p == 1?0:1));
        p = 0;
        q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p | q) + "\t" + (p == 1?0:1));
        p = 0;
        q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (p == 1?0:1));
    }

}
