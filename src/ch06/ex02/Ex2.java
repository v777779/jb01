package ch06.ex02;


import lib.utils.Vector;

/**
 * Created by V1 on 07-Feb-17.
 */

public class Ex2 {
    public static void main(String[] args) {
        Vector v = new Vector();
        MyList l = new MyList();
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
