package ch12.ex10.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {

    private static void f3() { // третий уровень
        f2();
    }

    private static void f2() { // второй уровень
        f1();
    }

    private static void f1() { // первый уровень
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] st = e.getStackTrace();
            System.out.println("Stack Trace Array[]:"+st.length);
            for (StackTraceElement stack : st) {
                System.out.print(" Class."+stack.getClassName()+" Method:"+stack.getMethodName());
                System.out.println();
            }

        }
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nTrace Stack Check\n");

        System.out.println("-------------f1--------------");
        f1();
        System.out.println("-------------f2--------------");
        f2();
        System.out.println("-------------f3--------------");
        f3();
        System.out.println("---------------------------");


    }
}
