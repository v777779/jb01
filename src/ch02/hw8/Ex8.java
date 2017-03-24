package ch02.hw8;

/**
 * Created by V1 on 03-Feb-17.
 */
public class Ex8 {



    public static void main(String[] args) {

        StaticTest.st.i = 15;
        StaticTest st1 = new StaticTest(1);
        StaticTest st2 = new StaticTest(2);
        StaticTest st3 = new StaticTest(3);
        StaticTest st4 = new StaticTest(4);

        System.out.println("StaticTest.st:"+StaticTest.st);
        System.out.println("StaticTest.st.i:"+StaticTest.st.i);
        StaticTest.show(st1,"st1");
        StaticTest.show(st2,"st2");
        StaticTest.show(st3,"st3");
        StaticTest.show(st4,"st4");




    }
}
