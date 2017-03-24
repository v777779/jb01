package ch07.ex9.local;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Root {
    int[] ints;
    Component1 component1  = new Component1();
    Component2 component2  = new Component2();
    Component3 component3  = new Component3();

    public Root() {
        System.out.println("Root.Constructor");
//        component1 = new Component1();
//        component2 = new Component2();
//        component3 = new Component3();
        System.out.println("Root.Constructor Done");
    }
}
