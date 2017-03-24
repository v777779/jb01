package ch10.ex03.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Outer {
    private String s;

    public class Inner {

     public void getName() {
         System.out.println("Inner.getName");
     }
        @Override
        public String toString() {
            return "Inner{"+
                    s+
                    "}";
        }
    }

    public Outer(String s) {
        this.s = s;
    }
}
