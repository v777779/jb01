package ch07.ex19.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Cloud extends Wind {
    private final void f() {
        System.out.println("Cloud.f private final");
    }
    private void g() {
        System.out.println("Cloud.g private final");
    }

}
