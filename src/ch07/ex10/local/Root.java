package ch07.ex10.local;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Root {
    int[] ints;
    Component1 component1;
    Component2 component2;
    Component3 component3;

    public Root(int[] ints) {
        System.out.println("Root.Constructor [] ints[] "+ints[0]+" "+ints[1]+" "+ints[2]);
        component1 = new Component1(ints[0]);
        component2 = new Component2(ints[1]);
        component3 = new Component3(ints[2]);
        System.out.println("Root.Constructor Done");
    }
}
