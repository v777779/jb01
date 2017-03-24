package ch14.ex25.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nInterfaces Isolation Check\n");
        A  a = new B(); // classB interface A
        a.f();
        // a.g(); .. нужно приведение типов
        System.out.println(a.getClass().getSimpleName());
        if (a instanceof B) {
            ((B) a).g();
            B b = (B)a;
            b.g();       // интерфейс не смог изолировать g() от программиста
        }


    }
}
