package lib.utils;


import static lib.utils.Print.p;

/**
 * Created by V1 on 07-Feb-17.
 */


public class Test {
    protected int iProtected = 1;
    int iDefault = 2;
    private int iPrivate = 3;

    protected int getDefault() {
        return iDefault;
    }

    protected int getPrivate() {
        return iPrivate;
    }

    protected void showProtected() {
       p("Test protected method");

    }

     void showDefault() {
        p("Test default method");
    }

    protected void showGetDefault() {
        System.out.print("Test getter > ");
        showDefault();
    }
    public static void main(String[] args) {
        Print.pf("Test pf %02d %s %5.1f",2,"232", 2.45);

    }
}
