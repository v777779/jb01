package ch12.ex10.include;

import lib.utils.Time;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {

    private static void f() throws Exception{  // действительно требует если есть повторное возбуждение
        try {
            throw new Exception();
        } catch (Exception e) {
            Time.sleep();
            System.out.println("Exception: catched in f()");
            System.out.println("========printStack==========");
            e.fillInStackTrace().printStackTrace(System.out);  // текущий стек
            System.out.println("============================");
            System.out.println("Throw f()>>>>");
            System.out.println("============================");
            throw e;
        }
    }

    private static void g() throws Exception{  // действительно требует если есть повторное возбуждение
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception: catched in g()");
            System.out.println("========fillin==============");
            e.fillInStackTrace().printStackTrace(System.out);  // текущий стек
            System.out.println("============================");
            System.out.println("Throw g()>>>>");
            System.out.println("============================");
            throw e;
        }
    }

    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nReUse Exception  Check\n");

        System.out.println("\n============================");
        System.out.println("printStackTrace Call:");
        System.out.println("============================");
        try {
            f();
        } catch (Exception e) {
            System.out.println("Exception: catched in main()");
            System.out.println("========printStack========");
            e.printStackTrace(System.out);  // текущий стек
        }

        System.out.println("\n============================");
        System.out.println("fillinStackTrace Call:");
        System.out.println("============================");
        try {
            g();
        } catch (Exception e) {
            System.out.println("Exception: catched in main()");
            System.out.println("=======fillin===============");
            e.fillInStackTrace().printStackTrace(System.out);  // текущий стек
        }
        Time.sleep();

    }
}
