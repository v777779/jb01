package ch08.ex12.local;

/**
 * Created by V1 on 09-Feb-17.
 */
public class GenClass {

    public static void voice(Rodent rodent) {
            rodent.voice();
    }

    public static void eat(Rodent rodent) {
   rodent.eat();
    }


    public static void sleep(Rodent rodent) {
        rodent.sleep();
    }


    public static void run(Rodent rodent) {
        rodent.run();
    }

    public GenClass() {
        System.out.println("GenClass.Constructor");
    }

    public static void dispose(Rodent rodent) {
        rodent.dispose();
    }
}
