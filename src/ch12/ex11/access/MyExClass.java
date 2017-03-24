package ch12.ex11.access;

/**
 * Created by V1 on 02-Mar-17.
 */
public class MyExClass {
    public void f() {
        try {
            g();
        } catch (MyExOne e) {
            System.out.println("catch:"+e);
            throw new RuntimeException();
        }


    }

    private void g() throws MyExOne {
        throw new MyExOne();
    }


}
