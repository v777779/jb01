package ch12.ex10.integra;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void f() throws Exception {
        System.out.println("Throw Exception from f()> ");
        throw new Exception("Generated in f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Catch12.ex.f() in g() printStackTrace > ");
            e.printStackTrace(System.out);  // печать в обычный канал
            System.out.println("Throw Forward g() > ");
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Catch12.ex.f() in h() printStackTrace > ");
            e.printStackTrace(System.out);
            System.out.println("Throw Forward h() > ");
            throw (Exception)e.fillInStackTrace();  //создание новой точки Exception
        }
    }

    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nException fillInStackTrace Check\n");

        System.out.println("Try_Catch_g()");
        System.out.println("-------------");
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: g() printStackTrace:");
            e.printStackTrace(System.out);
        }
        System.out.println("\nTry_Catch_h()");
        System.out.println("-------------");
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: h() printStackTrace:");
            e.printStackTrace(System.out);

        }


    }
}
