package ch07.ex19.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Air extends Cloud {
//    @Override
    public final void f() {
        System.out.println("Air.f public final");
    }

    public void g() {
        System.out.println("Air.g public final");
    }
}
