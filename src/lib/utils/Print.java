package lib.utils;

/**
 * Created by V1 on 07-Feb-17.
 */
public class Print {
    public static boolean flagPrint = true;

    private static void print(String s) {
        if(!flagPrint){
            return;
        }

        System.out.print(s);
    }
    private static void println(String s) {
        if(!flagPrint){
            return;
        }
        System.out.println(s);
    }

    public static void p(String s) {
        System.out.println(s);
    }
    public static void p() {
        System.out.println();
    }

    public static void p(Object o) {
        System.out.println(o);
    }

    public static void pp(String s) {
        System.out.print(s);
    }
    public static void pp(Object o) {
        System.out.print(o);
    }

    public static void pf(String s, Object... args) {
        System.out.printf(s,args);
    }


}
