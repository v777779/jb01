package ch10.ex1.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Outer{
    public class Inner {

     public void getName() {
         System.out.println("Inner.getName");
     }
    }

    public Inner getInner() {
        return new Inner();
    }
}
