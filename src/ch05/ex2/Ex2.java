package ch05.ex2;

/**
 * Created by V1 on 05-Feb-17.
 */
public class Ex2 {
    public static void main(String[] args) {
        CString2 s = new CString2();
        CString2 c = new CString2("check");

        System.out.println("Default Constructor  s.s1= "+s.s1+ " s.s2=  "+s.s2);
        System.out.println("Constructor w Param  c.s1= "+c.s1+ " c.s2= "+c.s2);

    }
}
