package ch06.ex2;


import lib.utils.List;
import lib.utils.Vector;

/**
 * Created by V1 on 07-Feb-17.
 */

public class Ex2 {
    public static void main(String[] args) {
        Vector v = new Vector();
        List l = new List();
        java.util.Vector vector = new java.util.Vector();

        System.out.println("Widget Check");
        NTest nTest = new NTest();
        System.out.println(nTest.getProtected());
        System.out.println(nTest.getDefault());
        System.out.println(nTest.getPrivate());
        nTest.show();

        System.out.println("Widget Check Class Private ");
        Sundae sundae =  Sundae.makeSundae();
        sundae.show();

    }
}
