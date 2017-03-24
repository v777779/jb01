package ch03.ex08;

/**
 * Created by V1 on 04-Feb-17.
 */
public class ShortCircuit {
    boolean test1(int val) {
        System.out.print("test1("+val+")");
        System.out.println("> result: "+(val<1));
        return (val<1);
    }
    boolean test2(int val) {
        System.out.print("test2("+val+")");
        System.out.println("> result: "+(val < 2));
        return (val < 2);
    }
    boolean test3(int val) {
        System.out.print("test3("+val+")");
        System.out.println("> result: "+(val<3));
        return (val<3);
    }
}
