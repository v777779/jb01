package ch07.ex12a.access;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Utensil {
    public void calc (int i) {
        System.out.println("Utensil.calc : "+ i);
    }
    public void calc (float f) {
        System.out.println("Utensil.calc : "+ f);
    }
    public void calc (String s) {
        System.out.println("Utensil.calc : "+ s);
    }
}
